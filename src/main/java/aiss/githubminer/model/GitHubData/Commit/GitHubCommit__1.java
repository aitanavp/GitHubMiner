
package aiss.githubminer.model.GitHubData.Commit;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "author",
    "committer",
    "message",
    "tree",
    "comment_count",
    "verification"
})
@Generated("jsonschema2pojo")
public class GitHubCommit__1 {

    @JsonProperty("url")
    private String url;
    @JsonProperty("author")
    private GitHubAuthor author;
    @JsonProperty("committer")
    private GitHubCommitter committer;
    @JsonProperty("message")
    private String message;
    @JsonProperty("tree")
    private GitHubTree tree;
    @JsonProperty("comment_count")
    private Integer commentCount;
    @JsonProperty("verification")
    private GitHubVerification verification;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("author")
    public GitHubAuthor getAuthor() {
        return author;
    }

    @JsonProperty("author")
    public void setAuthor(GitHubAuthor author) {
        this.author = author;
    }

    @JsonProperty("committer")
    public GitHubCommitter getCommitter() {
        return committer;
    }

    @JsonProperty("committer")
    public void setCommitter(GitHubCommitter committer) {
        this.committer = committer;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("tree")
    public GitHubTree getTree() {
        return tree;
    }

    @JsonProperty("tree")
    public void setTree(GitHubTree tree) {
        this.tree = tree;
    }

    @JsonProperty("comment_count")
    public Integer getCommentCount() {
        return commentCount;
    }

    @JsonProperty("comment_count")
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    @JsonProperty("verification")
    public GitHubVerification getVerification() {
        return verification;
    }

    @JsonProperty("verification")
    public void setVerification(GitHubVerification verification) {
        this.verification = verification;
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
        sb.append(GitHubCommit__1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null)?"<null>":this.author));
        sb.append(',');
        sb.append("committer");
        sb.append('=');
        sb.append(((this.committer == null)?"<null>":this.committer));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("tree");
        sb.append('=');
        sb.append(((this.tree == null)?"<null>":this.tree));
        sb.append(',');
        sb.append("commentCount");
        sb.append('=');
        sb.append(((this.commentCount == null)?"<null>":this.commentCount));
        sb.append(',');
        sb.append("verification");
        sb.append('=');
        sb.append(((this.verification == null)?"<null>":this.verification));
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
