package aiss.githubminer.service.GitHubService;


import aiss.githubminer.model.Commit;
import aiss.githubminer.model.GitHubData.Repository.GitHubRepository;
import aiss.githubminer.model.Issue;
import aiss.githubminer.model.Project;
import aiss.githubminer.model.utils.GitHubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    IssueService issueService;

    @Autowired
    CommitService commitService;

    final String baseUri = "https://api.github.com";

    @Value("${github.token}")
    String token;

    public Project getProjectByOwnerAndName(String owner, String repo, Integer sinceCommits, Integer sinceIssues, Integer pages) {
        String uri = baseUri + "/repos/" + owner + "/" + repo;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token );
        HttpEntity<GitHubRepository> request = new HttpEntity<>(null, headers);
        ResponseEntity<GitHubRepository> response = restTemplate.exchange(uri,
                HttpMethod.GET, request, GitHubRepository.class);
        List<Commit> commits = commitService.sinceCommits(owner, repo, sinceCommits, pages);
        List<Issue> issues = issueService.sinceIssues(owner, repo, sinceIssues, pages);
        return GitHubMapper.toProject(response.getBody(), commits, issues);
    }
}
