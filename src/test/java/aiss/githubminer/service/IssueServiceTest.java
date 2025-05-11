package aiss.githubminer.service;

import aiss.githubminer.model.Issue;
import aiss.githubminer.service.IssueService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class IssueServiceTest {

    @Autowired
    IssueService issueService;

    @Test
    public void getRecentIssuesTest() {
        List<Issue> issues = issueService.sinceIssues("octocat", "Spoon-Knife", 3650, 1);
        assertNotNull(issues, "The list of issues should not be null");
        assertFalse(issues.isEmpty(), "The list of issues should not be empty");
        System.out.println("Issues fetched: " + issues.size());
    }
}
