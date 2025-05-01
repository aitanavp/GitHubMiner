package aiss.githubminer.service.GitHubService;

import aiss.githubminer.model.Comment;
import aiss.githubminer.model.GitHubData.Comment.GitHubComment;
import aiss.githubminer.model.utils.GitHubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    RestTemplate restTemplate;

    final String baseUri = "https://api.github.com";

    @Value("${github.token}")
    String token;

    public List<Comment> getComments(String owner, String repo, Integer issue) {
        String uri = baseUri + "/repos/" + owner + "/" + repo + "/issues/" + issue + "/comments";
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token );
        HttpEntity<GitHubComment[]> request = new HttpEntity<>(null, headers);
        ResponseEntity<GitHubComment[]> response = restTemplate.exchange(uri,
                HttpMethod.GET, request, GitHubComment[].class);
        return Arrays.stream(response.getBody()).map(GitHubMapper::toComment).toList();
    }
}
