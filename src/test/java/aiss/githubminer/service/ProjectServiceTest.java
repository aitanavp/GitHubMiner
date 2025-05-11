package aiss.githubminer.service;

import aiss.githubminer.model.Project;
import aiss.githubminer.service.ProjectService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProjectServiceTest {

    @Autowired
    ProjectService projectService;

    @Test
    @DisplayName("Get project data from spring-framework repo")
    void getProjectTest() {
        Project project = projectService.getProjectByOwnerAndName("spring-projects", "spring-framework", 30, 30, 1, 4);

        assertNotNull(project, "The project should not be null");
        assertNotNull(project.getId(), "The project ID should not be null");
        assertEquals("spring-framework", project.getName(), "The project name should match");
        assertFalse(project.getCommits().isEmpty(), "The project should contain commits");
        assertFalse(project.getIssues().isEmpty(), "The project should contain issues");

        System.out.println("Project name: " + project.getName());
        System.out.println("Commits: " + project.getCommits().size());
        System.out.println("Issues: " + project.getIssues().size());
    }
}
