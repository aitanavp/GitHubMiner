package aiss.githubminer.service;

import aiss.githubminer.model.User;
import aiss.githubminer.service.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    @DisplayName("Get GitHub user by login")
    void getUserByLoginTest() {
        String login = "VJH9988";
        User user = userService.getUserByLogin(login);

        assertNotNull(user, "The user should not be null");
        assertEquals(login, user.getId(), "The user login should match the expected one");

        System.out.println("User login: " + user.getId());
        System.out.println("User name: " + user.getName());
    }
}
