package controller;

import aiss.githubminer.model.Project;
import aiss.githubminer.service.GitHubService.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/githubminer")
public class GitHubController {

    @Autowired
    ProjectService projectService;

    @Autowired
    RestTemplate restTemplate;

    final String uri = "http://localhost:8080";

    @GetMapping("/{owner}/{repo}")
    public Project getData(@PathVariable String owner, @PathVariable String repo,
                           @RequestParam(defaultValue = "5") Integer sinceCommits,
                           @RequestParam(defaultValue = "20") Integer sinceIssues,
                           @RequestParam(defaultValue = "2") Integer maxPages){
        return projectService.getProjectByOwnerAndName(owner,repo, sinceCommits, sinceIssues,
                maxPages);
    }
    @PostMapping("/{owner}/{repo}")
    public Project sendData(@PathVariable String owner, @PathVariable String repo,
                            @RequestParam(defaultValue = "5") Integer sinceCommits,
                            @RequestParam(defaultValue = "20") Integer sinceIssues,
                            @RequestParam(defaultValue = "2") Integer maxPages) {
        Project project = projectService.getProjectByOwnerAndName(owner, repo, sinceCommits, sinceIssues, maxPages);
        HttpEntity<Project> request = new HttpEntity<>(project);
        ResponseEntity<Project> response = restTemplate.exchange(uri, HttpMethod.POST,request, Project.class);
        return response.getBody();
    }
}
