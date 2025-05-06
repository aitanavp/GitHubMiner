package aiss.githubminer.model.utils;

import aiss.githubminer.model.*;
import aiss.githubminer.model.GitHubData.Comment.GitHubComment;
import aiss.githubminer.model.GitHubData.Commit.GitHubCommit;
import aiss.githubminer.model.GitHubData.Issue.GitHubIssue;
import aiss.githubminer.model.GitHubData.Issue.GitHubLabel;
import aiss.githubminer.model.GitHubData.Repository.GitHubRepository;
import aiss.githubminer.model.GitHubData.User.GitHubUser;

import java.util.List;
import java.util.UUID;

public class GitHubMapper {

    public static Commit toCommit(GitHubCommit data) {
        Commit commit = new Commit();
        commit.setId(data.getSha());
        String fullMessage = data.getCommit().getMessage();
        String title = fullMessage.split("\n")[0];
        String message = fullMessage.substring(fullMessage.indexOf("\n") + 1);
        commit.setTitle(title);
        commit.setMessage(message);
        commit.setAuthorName(data.getCommit().getAuthor().getName());
        commit.setAuthorEmail(data.getCommit().getAuthor().getEmail());
        commit.setAuthoredDate(data.getCommit().getAuthor().getDate());
        commit.setCommitterName(data.getCommit().getCommitter().getName());
        commit.setCommitterEmail(data.getCommit().getCommitter().getEmail());
        commit.setCommittedDate(data.getCommit().getCommitter().getDate());
        commit.setWebUrl(data.getHtmlUrl());

        return commit;
    }

    public static Project toProject(GitHubRepository data, List<Commit> commits, List<Issue> issues) {
        Project project = new Project();
        project.setId(data.getId().toString());
        project.setName(data.getName());
        project.setWebUrl(data.getUrl());
        project.setIssues(issues);
        project.setCommits(commits);
        return project;
    }

    public static Issue toIssue(GitHubIssue data, List<Comment> comments) {
        Issue issue = new Issue();
        issue.setId(data.getId().toString());
        issue.setTitle(data.getTitle());
        issue.setDescription(data.getBody());
        issue.setState(data.getState());
        issue.setCreatedAt(data.getCreatedAt());
        issue.setUpdatedAt(data.getUpdatedAt());
        issue.setClosedAt(data.getClosedAt());
        issue.setLabels(data.getLabels().stream().map(GitHubLabel::getName).toList());
        issue.setAuthor(toUser(data.getUser()));
        issue.setAssignee(toUser(data.getAssignee()));
        issue.setUpvotes(data.getReactions().getUpvote());
        issue.setDownvotes(data.getReactions().getDownvote());
        issue.setWebUrl(data.getUrl());
        issue.setComments(comments);
        return issue;
    }

    public static User toUser(GitHubUser data) {
        User user = new User();
        if (data == null) { //To handle when assignees are null
            return null;
        }
        user.setId(data.getId().toString());
        user.setName(data.getName()==null?"":data.getName()); //ASSIGNEES DO NOT HAVE A NAME
        user.setUsername(data.getLogin());
        user.setAvatarUrl(data.getAvatarUrl());
        user.setWebUrl(data.getUrl());

        return user;
    }

    public static Comment toComment(GitHubComment data) {
        Comment comment = new Comment();
        comment.setId(data.getId().toString());
        comment.setBody(data.getBody());
        comment.setAuthor(toUser(data.getUser()));
        comment.setCreatedAt(data.getCreatedAt());
        comment.setUpdatedAt(data.getUpdatedAt());

        return comment;
    }


}
