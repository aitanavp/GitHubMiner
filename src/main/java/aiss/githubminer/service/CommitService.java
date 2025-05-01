package aiss.githubminer.service;

import aiss.githubminer.model.GitHubData.Commit.GitHubCommit;
import aiss.githubminer.model.utils.GitHubMapper;
import aiss.githubminer.model.utils.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import aiss.githubminer.model.Commit;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CommitService {

    @Autowired
    RestTemplate restTemplate;

    final String baseUri = "https://api.github.com";

    @Value("${github.token}")
    String token;

    public List<Commit> sinceCommits(String owner, String repo, Integer days, Integer pages){
        String since = OffsetDateTime.now(ZoneOffset.UTC).minusDays(days).truncatedTo(ChronoUnit.SECONDS).toString();
        String uri = baseUri + "/repos/" + owner + "/" + repo +
                "/commits?page=1&since=" + since;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token );
        HttpEntity<GitHubCommit[]> request = new HttpEntity<>(null, headers);
        List<Commit> commits = new ArrayList<>();
        int page = 1;
        while (page <= pages && uri!= null){
            ResponseEntity<GitHubCommit[]> response = restTemplate.exchange(uri,
                    HttpMethod.GET, request, GitHubCommit[].class);
            List<GitHubCommit> commitsData = Arrays.asList(response.getBody());
            commits.addAll(
                    commitsData.stream()
                            .map(GitHubMapper::toCommit)
                            .toList()
            );
            uri = Rest.getNextPageUrl(response.getHeaders());
            page++;
        }
        return commits;
    }
}
