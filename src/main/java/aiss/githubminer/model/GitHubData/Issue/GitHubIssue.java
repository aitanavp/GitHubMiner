
package aiss.githubminer.model.GitHubData.Issue;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import aiss.githubminer.model.GitHubData.User.GitHubUser;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "node_id",
    "url",
    "repository_url",
    "labels_url",
    "comments_url",
    "events_url",
    "html_url",
    "number",
    "state",
    "title",
    "body",
    "user",
    "labels",
    "assignee",
    "assignees",
    "milestone",
    "locked",
    "active_lock_reason",
    "comments",
    "pull_request",
    "closed_at",
    "created_at",
    "updated_at",
    "closed_by",
    "author_association",
    "state_reason"
})
@Generated("jsonschema2pojo")
public class GitHubIssue {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("url")
    private String url;
    @JsonProperty("repository_url")
    private String repositoryUrl;
    @JsonProperty("labels_url")
    private String labelsUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("events_url")
    private String eventsUrl;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("state")
    private String state;
    @JsonProperty("title")
    private String title;
    @JsonProperty("body")
    private String body;
    @JsonProperty("user")
    private GitHubUser user;
    @JsonProperty("labels")
    private List<GitHubLabel> labels;
    @JsonProperty("assignee")
    private GitHubUser assignee;
    @JsonProperty("assignees")
    private List<GitHubUser> assignees;
    @JsonProperty("milestone")
    private GitHubMilestone milestone;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("active_lock_reason")
    private String activeLockReason;
    @JsonProperty("comments")
    private Integer comments;
    @JsonProperty("pull_request")
    private GitHubPullRequestIssue pullRequest;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_by")
    private GitHubClosedBy closedBy;
    @JsonProperty("reactions")
    private GitHubReactions reactions;
    @JsonProperty("author_association")
    private String authorAssociation;
    @JsonProperty("state_reason")
    private String stateReason;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("node_id")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("repository_url")
    public String getRepositoryUrl() {
        return repositoryUrl;
    }

    @JsonProperty("repository_url")
    public void setRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    @JsonProperty("labels_url")
    public String getLabelsUrl() {
        return labelsUrl;
    }

    @JsonProperty("labels_url")
    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    @JsonProperty("events_url")
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("number")
    public Integer getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    @JsonProperty("user")
    public GitHubUser getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(GitHubUser user) {
        this.user = user;
    }

    @JsonProperty("labels")
    public List<GitHubLabel> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<GitHubLabel> labels) {
        this.labels = labels;
    }

    @JsonProperty("assignee")
    public GitHubUser getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(GitHubUser assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("assignees")
    public List<GitHubUser> getAssignees() {
        return assignees;
    }

    @JsonProperty("assignees")
    public void setAssignees(List<GitHubUser> assignees) {
        this.assignees = assignees;
    }

    @JsonProperty("milestone")
    public GitHubMilestone getMilestone() {
        return milestone;
    }

    @JsonProperty("milestone")
    public void setMilestone(GitHubMilestone milestone) {
        this.milestone = milestone;
    }

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("active_lock_reason")
    public String getActiveLockReason() {
        return activeLockReason;
    }

    @JsonProperty("active_lock_reason")
    public void setActiveLockReason(String activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    @JsonProperty("comments")
    public Integer getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @JsonProperty("pull_request")
    public GitHubPullRequestIssue getPullRequest() {
        return pullRequest;
    }

    @JsonProperty("pull_request")
    public void setPullRequest(GitHubPullRequestIssue pullRequest) {
        this.pullRequest = pullRequest;
    }

    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("closed_by")
    public GitHubClosedBy getClosedBy() {
        return closedBy;
    }

    @JsonProperty("closed_by")
    public void setClosedBy(GitHubClosedBy closedBy) {
        this.closedBy = closedBy;
    }

    @JsonProperty("reactions")
    public GitHubReactions getReactions() {
        return reactions;
    }

    @JsonProperty("reactions")
    public void setReactions(GitHubReactions reactions) {
        this.reactions = reactions;
    }

    @JsonProperty("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    @JsonProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @JsonProperty("state_reason")
    public String getStateReason() {
        return stateReason;
    }

    @JsonProperty("state_reason")
    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GitHubIssue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("repositoryUrl");
        sb.append('=');
        sb.append(((this.repositoryUrl == null)?"<null>":this.repositoryUrl));
        sb.append(',');
        sb.append("labelsUrl");
        sb.append('=');
        sb.append(((this.labelsUrl == null)?"<null>":this.labelsUrl));
        sb.append(',');
        sb.append("commentsUrl");
        sb.append('=');
        sb.append(((this.commentsUrl == null)?"<null>":this.commentsUrl));
        sb.append(',');
        sb.append("eventsUrl");
        sb.append('=');
        sb.append(((this.eventsUrl == null)?"<null>":this.eventsUrl));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("milestone");
        sb.append('=');
        sb.append(((this.milestone == null)?"<null>":this.milestone));
        sb.append(',');
        sb.append("locked");
        sb.append('=');
        sb.append(((this.locked == null)?"<null>":this.locked));
        sb.append(',');
        sb.append("activeLockReason");
        sb.append('=');
        sb.append(((this.activeLockReason == null)?"<null>":this.activeLockReason));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("pullRequest");
        sb.append('=');
        sb.append(((this.pullRequest == null)?"<null>":this.pullRequest));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("closedBy");
        sb.append('=');
        sb.append(((this.closedBy == null)?"<null>":this.closedBy));
        sb.append(',');
        sb.append("reactions");
        sb.append('=');
        sb.append(((this.reactions == null)?"<null>":this.reactions));
        sb.append(',');
        sb.append("authorAssociation");
        sb.append('=');
        sb.append(((this.authorAssociation == null)?"<null>":this.authorAssociation));
        sb.append(',');
        sb.append("stateReason");
        sb.append('=');
        sb.append(((this.stateReason == null)?"<null>":this.stateReason));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
