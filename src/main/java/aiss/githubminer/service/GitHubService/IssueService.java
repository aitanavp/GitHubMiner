package aiss.githubminer.service.GitHubService;

import aiss.githubminer.model.GitHubData.Issue.GitHubIssue;
import aiss.githubminer.model.Issue;
import aiss.githubminer.model.utils.GitHubMapper;
import aiss.githubminer.model.utils.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class IssueService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CommentService commentService;

    final String baseUri = "https://api.github.com";

    @Value("${github.token}")
    String token;

    public List<Issue> sinceIssues(String owner, String repo, Integer days, Integer pages) {
        LocalDate date = LocalDate.now().minusDays(days);
        String uri = baseUri + "/repos/" + owner + "/" + repo +
                "/issues?state=all&page=1&since=" + date;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token );
        HttpEntity<GitHubIssue[]> request = new HttpEntity<>(null, headers);
        List<Issue> issues = new ArrayList<>();
        int page = 1;
        while (page <= pages && uri!= null){
            ResponseEntity<GitHubIssue[]> response = restTemplate.exchange(uri,
                    HttpMethod.GET, request, GitHubIssue[].class);
            List<GitHubIssue> issuesData = Arrays.asList(response.getBody());
            issues.addAll(
                    issuesData.stream()
                            .map(i->GitHubMapper.toIssue(i, commentService.getComments(owner, repo, i.getId())))
                            .toList()
            );
            uri = Rest.getNextPageUrl(response.getHeaders());
            page++;
        }
        return issues;
    }

}
