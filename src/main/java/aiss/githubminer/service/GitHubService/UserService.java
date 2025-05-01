package aiss.githubminer.service.GitHubService;

import aiss.githubminer.model.GitHubData.User.GitHubUser;
import aiss.githubminer.model.User;
import aiss.githubminer.model.utils.GitHubMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    RestTemplate restTemplate;

    final String baseUri = "https://api.github.com";

    @Value("${github.token}")
    String token;

    public User getUserByLogin(String login) {
        String uri = baseUri + "/users/" + login;
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + token );
        HttpEntity<GitHubUser> request = new HttpEntity<>(null, headers);
        ResponseEntity<GitHubUser> response = restTemplate.exchange(uri,
                HttpMethod.GET, request, GitHubUser.class);
        return GitHubMapper.toUser(response.getBody());
    }
}
