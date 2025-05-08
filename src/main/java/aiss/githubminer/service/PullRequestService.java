package aiss.githubminer.service;

import aiss.githubminer.model.GitHubData.Issue.GitHubIssue;
import aiss.githubminer.model.GitHubData.PullRequest.GitHubPullRequest;
import aiss.githubminer.model.Issue;
import aiss.githubminer.model.PullRequest;
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

import java.net.URI;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PullRequestService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    CommentService commentService;

    final String baseUri = "https://api.github.com";

    @Value("${github.token}")
    String token;

    public List<PullRequest> sincePulls(String owner, String repo, Integer days, Integer pages) {
        String since = OffsetDateTime.now(ZoneOffset.UTC).minusDays(days).truncatedTo(ChronoUnit.SECONDS)
                .toString();
        String uri = baseUri + "/repos/" + owner + "/" + repo +
                "/pulls?state=all&page=1&since=" + since;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token );
        HttpEntity<GitHubPullRequest[]> request = new HttpEntity<>(null, headers);
        List<PullRequest> pulls = new ArrayList<>();
        int page = 1;
        while (page <= pages && uri!= null){
            URI uri2 = URI.create(uri); // Fixed escaping
            ResponseEntity<GitHubPullRequest[]> response = restTemplate.exchange(uri2,
                    HttpMethod.GET, request, GitHubPullRequest[].class);
            List<GitHubPullRequest> pullData = Arrays.asList(response.getBody());
            pulls.addAll(
                    pullData.stream()
                            .map(i-> GitHubMapper.toPullRequest(i, commentService.getCommentsFromPullRequesrs(owner, repo, i.getNumber())))
                            .toList()
            );
            uri = Rest.getNextPageUrl(response.getHeaders());
            page++;
        }
        return pulls;
    }
}
