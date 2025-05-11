package aiss.githubminer.service;

import aiss.githubminer.model.Commit;
import aiss.githubminer.service.CommitService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommitServiceTest {

    @Autowired
    CommitService commitService;

    @Test
    @DisplayName("Get recent commits from spring-framework repo")
    void getRecentCommitsTest() {

        List<Commit> commits = commitService.sinceCommits("spring-projects", "spring-framework", 100, 1);


        assertNotNull(commits, "The list of commits should not be null");
        assertFalse(commits.isEmpty(), "The list of commits should not be empty");

        System.out.println("Fetched commits: " + commits.size());
        commits.forEach(c -> System.out.println(c.getMessage()));
    }
}
