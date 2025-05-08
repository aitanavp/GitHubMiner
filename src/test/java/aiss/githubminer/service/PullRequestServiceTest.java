package aiss.githubminer.service;

import aiss.githubminer.model.Comment;
import aiss.githubminer.model.PullRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class PullRequestServiceTest {
    @Autowired
    private PullRequestService pullRequestService;

    @Autowired
    private CommentService commentService;

    @Test
    void getPullRequests() {
        List<PullRequest> pull = pullRequestService.sincePulls("spring-projects","spring-framework", 5,2);
        System.out.println(pull);
    }

    @Test
    void getComments() {
        List<Comment> comments = commentService.getCommentsFromPullRequesrs("spring-projects","spring-framework", 5);
    }


}