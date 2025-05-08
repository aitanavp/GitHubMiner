
package aiss.githubminer.model.GitHubData.PullRequest;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "id",
    "node_id",
    "html_url",
    "diff_url",
    "patch_url",
    "issue_url",
    "number",
    "state",
    "locked",
    "title",
    "user",
    "body",
    "created_at",
    "updated_at",
    "closed_at",
    "merged_at",
    "merge_commit_sha",
    "assignee",
    "assignees",
    "requested_reviewers",
    "requested_teams",
    "labels",
    "milestone",
    "draft",
    "commits_url",
    "review_comments_url",
    "review_comment_url",
    "comments_url",
    "statuses_url",
    "head",
    "base",
    "_links",
    "author_association",
    "auto_merge",
    "active_lock_reason"
})
@Generated("jsonschema2pojo")
public class GitHubPullRequest {

    @JsonProperty("url")
    private String url;
    @JsonProperty("id")
    private Long id;
    @JsonProperty("node_id")
    private String nodeId;
    @JsonProperty("html_url")
    private String htmlUrl;
    @JsonProperty("diff_url")
    private String diffUrl;
    @JsonProperty("patch_url")
    private String patchUrl;
    @JsonProperty("issue_url")
    private String issueUrl;
    @JsonProperty("number")
    private Integer number;
    @JsonProperty("state")
    private String state;
    @JsonProperty("locked")
    private Boolean locked;
    @JsonProperty("title")
    private String title;
    @JsonProperty("user")
    private User user;
    @JsonProperty("body")
    private String body;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("closed_at")
    private Object closedAt;
    @JsonProperty("merged_at")
    private Object mergedAt;
    @JsonProperty("merge_commit_sha")
    private String mergeCommitSha;
    @JsonProperty("assignee")
    private Assignee assignee;
    @JsonProperty("assignees")
    private List<Assignee__1> assignees;
    @JsonProperty("requested_reviewers")
    private List<Object> requestedReviewers;
    @JsonProperty("requested_teams")
    private List<Object> requestedTeams;
    @JsonProperty("labels")
    private List<Label> labels;
    @JsonProperty("milestone")
    private Object milestone;
    @JsonProperty("draft")
    private Boolean draft;
    @JsonProperty("commits_url")
    private String commitsUrl;
    @JsonProperty("review_comments_url")
    private String reviewCommentsUrl;
    @JsonProperty("review_comment_url")
    private String reviewCommentUrl;
    @JsonProperty("comments_url")
    private String commentsUrl;
    @JsonProperty("statuses_url")
    private String statusesUrl;
    @JsonProperty("head")
    private Head head;
    @JsonProperty("base")
    private Base base;
    @JsonProperty("_links")
    private Links links;
    @JsonProperty("author_association")
    private String authorAssociation;
    @JsonProperty("auto_merge")
    private Object autoMerge;
    @JsonProperty("active_lock_reason")
    private Object activeLockReason;

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

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

    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    @JsonProperty("html_url")
    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    @JsonProperty("diff_url")
    public String getDiffUrl() {
        return diffUrl;
    }

    @JsonProperty("diff_url")
    public void setDiffUrl(String diffUrl) {
        this.diffUrl = diffUrl;
    }

    @JsonProperty("patch_url")
    public String getPatchUrl() {
        return patchUrl;
    }

    @JsonProperty("patch_url")
    public void setPatchUrl(String patchUrl) {
        this.patchUrl = patchUrl;
    }

    @JsonProperty("issue_url")
    public String getIssueUrl() {
        return issueUrl;
    }

    @JsonProperty("issue_url")
    public void setIssueUrl(String issueUrl) {
        this.issueUrl = issueUrl;
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

    @JsonProperty("locked")
    public Boolean getLocked() {
        return locked;
    }

    @JsonProperty("locked")
    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
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

    @JsonProperty("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("merged_at")
    public Object getMergedAt() {
        return mergedAt;
    }

    @JsonProperty("merged_at")
    public void setMergedAt(Object mergedAt) {
        this.mergedAt = mergedAt;
    }

    @JsonProperty("merge_commit_sha")
    public String getMergeCommitSha() {
        return mergeCommitSha;
    }

    @JsonProperty("merge_commit_sha")
    public void setMergeCommitSha(String mergeCommitSha) {
        this.mergeCommitSha = mergeCommitSha;
    }

    @JsonProperty("assignee")
    public Assignee getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("assignees")
    public List<Assignee__1> getAssignees() {
        return assignees;
    }

    @JsonProperty("assignees")
    public void setAssignees(List<Assignee__1> assignees) {
        this.assignees = assignees;
    }

    @JsonProperty("requested_reviewers")
    public List<Object> getRequestedReviewers() {
        return requestedReviewers;
    }

    @JsonProperty("requested_reviewers")
    public void setRequestedReviewers(List<Object> requestedReviewers) {
        this.requestedReviewers = requestedReviewers;
    }

    @JsonProperty("requested_teams")
    public List<Object> getRequestedTeams() {
        return requestedTeams;
    }

    @JsonProperty("requested_teams")
    public void setRequestedTeams(List<Object> requestedTeams) {
        this.requestedTeams = requestedTeams;
    }

    @JsonProperty("labels")
    public List<Label> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @JsonProperty("milestone")
    public Object getMilestone() {
        return milestone;
    }

    @JsonProperty("milestone")
    public void setMilestone(Object milestone) {
        this.milestone = milestone;
    }

    @JsonProperty("draft")
    public Boolean getDraft() {
        return draft;
    }

    @JsonProperty("draft")
    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    @JsonProperty("commits_url")
    public String getCommitsUrl() {
        return commitsUrl;
    }

    @JsonProperty("commits_url")
    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    @JsonProperty("review_comments_url")
    public String getReviewCommentsUrl() {
        return reviewCommentsUrl;
    }

    @JsonProperty("review_comments_url")
    public void setReviewCommentsUrl(String reviewCommentsUrl) {
        this.reviewCommentsUrl = reviewCommentsUrl;
    }

    @JsonProperty("review_comment_url")
    public String getReviewCommentUrl() {
        return reviewCommentUrl;
    }

    @JsonProperty("review_comment_url")
    public void setReviewCommentUrl(String reviewCommentUrl) {
        this.reviewCommentUrl = reviewCommentUrl;
    }

    @JsonProperty("comments_url")
    public String getCommentsUrl() {
        return commentsUrl;
    }

    @JsonProperty("comments_url")
    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    @JsonProperty("statuses_url")
    public String getStatusesUrl() {
        return statusesUrl;
    }

    @JsonProperty("statuses_url")
    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    @JsonProperty("head")
    public Head getHead() {
        return head;
    }

    @JsonProperty("head")
    public void setHead(Head head) {
        this.head = head;
    }

    @JsonProperty("base")
    public Base getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(Base base) {
        this.base = base;
    }

    @JsonProperty("_links")
    public Links getLinks() {
        return links;
    }

    @JsonProperty("_links")
    public void setLinks(Links links) {
        this.links = links;
    }

    @JsonProperty("author_association")
    public String getAuthorAssociation() {
        return authorAssociation;
    }

    @JsonProperty("author_association")
    public void setAuthorAssociation(String authorAssociation) {
        this.authorAssociation = authorAssociation;
    }

    @JsonProperty("auto_merge")
    public Object getAutoMerge() {
        return autoMerge;
    }

    @JsonProperty("auto_merge")
    public void setAutoMerge(Object autoMerge) {
        this.autoMerge = autoMerge;
    }

    @JsonProperty("active_lock_reason")
    public Object getActiveLockReason() {
        return activeLockReason;
    }

    @JsonProperty("active_lock_reason")
    public void setActiveLockReason(Object activeLockReason) {
        this.activeLockReason = activeLockReason;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(GitHubPullRequest.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("htmlUrl");
        sb.append('=');
        sb.append(((this.htmlUrl == null)?"<null>":this.htmlUrl));
        sb.append(',');
        sb.append("diffUrl");
        sb.append('=');
        sb.append(((this.diffUrl == null)?"<null>":this.diffUrl));
        sb.append(',');
        sb.append("patchUrl");
        sb.append('=');
        sb.append(((this.patchUrl == null)?"<null>":this.patchUrl));
        sb.append(',');
        sb.append("issueUrl");
        sb.append('=');
        sb.append(((this.issueUrl == null)?"<null>":this.issueUrl));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("locked");
        sb.append('=');
        sb.append(((this.locked == null)?"<null>":this.locked));
        sb.append(',');
        sb.append("title");
        sb.append('=');
        sb.append(((this.title == null)?"<null>":this.title));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("body");
        sb.append('=');
        sb.append(((this.body == null)?"<null>":this.body));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("closedAt");
        sb.append('=');
        sb.append(((this.closedAt == null)?"<null>":this.closedAt));
        sb.append(',');
        sb.append("mergedAt");
        sb.append('=');
        sb.append(((this.mergedAt == null)?"<null>":this.mergedAt));
        sb.append(',');
        sb.append("mergeCommitSha");
        sb.append('=');
        sb.append(((this.mergeCommitSha == null)?"<null>":this.mergeCommitSha));
        sb.append(',');
        sb.append("assignee");
        sb.append('=');
        sb.append(((this.assignee == null)?"<null>":this.assignee));
        sb.append(',');
        sb.append("assignees");
        sb.append('=');
        sb.append(((this.assignees == null)?"<null>":this.assignees));
        sb.append(',');
        sb.append("requestedReviewers");
        sb.append('=');
        sb.append(((this.requestedReviewers == null)?"<null>":this.requestedReviewers));
        sb.append(',');
        sb.append("requestedTeams");
        sb.append('=');
        sb.append(((this.requestedTeams == null)?"<null>":this.requestedTeams));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null)?"<null>":this.labels));
        sb.append(',');
        sb.append("milestone");
        sb.append('=');
        sb.append(((this.milestone == null)?"<null>":this.milestone));
        sb.append(',');
        sb.append("draft");
        sb.append('=');
        sb.append(((this.draft == null)?"<null>":this.draft));
        sb.append(',');
        sb.append("commitsUrl");
        sb.append('=');
        sb.append(((this.commitsUrl == null)?"<null>":this.commitsUrl));
        sb.append(',');
        sb.append("reviewCommentsUrl");
        sb.append('=');
        sb.append(((this.reviewCommentsUrl == null)?"<null>":this.reviewCommentsUrl));
        sb.append(',');
        sb.append("reviewCommentUrl");
        sb.append('=');
        sb.append(((this.reviewCommentUrl == null)?"<null>":this.reviewCommentUrl));
        sb.append(',');
        sb.append("commentsUrl");
        sb.append('=');
        sb.append(((this.commentsUrl == null)?"<null>":this.commentsUrl));
        sb.append(',');
        sb.append("statusesUrl");
        sb.append('=');
        sb.append(((this.statusesUrl == null)?"<null>":this.statusesUrl));
        sb.append(',');
        sb.append("head");
        sb.append('=');
        sb.append(((this.head == null)?"<null>":this.head));
        sb.append(',');
        sb.append("base");
        sb.append('=');
        sb.append(((this.base == null)?"<null>":this.base));
        sb.append(',');
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null)?"<null>":this.links));
        sb.append(',');
        sb.append("authorAssociation");
        sb.append('=');
        sb.append(((this.authorAssociation == null)?"<null>":this.authorAssociation));
        sb.append(',');
        sb.append("autoMerge");
        sb.append('=');
        sb.append(((this.autoMerge == null)?"<null>":this.autoMerge));
        sb.append(',');
        sb.append("activeLockReason");
        sb.append('=');
        sb.append(((this.activeLockReason == null)?"<null>":this.activeLockReason));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
