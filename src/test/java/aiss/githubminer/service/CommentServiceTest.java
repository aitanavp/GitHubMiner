package aiss.githubminer.service;

import aiss.githubminer.model.Comment;
import aiss.githubminer.service.CommentService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommentServiceTest {

    @Autowired
    CommentService commentService;

    @Test
    @DisplayName("Test getComments: octocat/Hello-World issue 348")
    void getCommentsTest() {
        List<Comment> comments = commentService.getCommentsFromIssues("octocat", "Hello-World", 348);

        assertNotNull(comments, "The comment list should not be null");
        assertFalse(comments.isEmpty(), "The comment list should not be empty");

        System.out.println("Fetched " + comments.size() + " comments.");
        comments.forEach(c -> System.out.println("Comment body: " + c.getBody()));
    }
}
