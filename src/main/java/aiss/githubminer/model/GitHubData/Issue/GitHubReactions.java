package aiss.githubminer.model.GitHubData.Issue;

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
        "total_count",
        "upvote",
        "downvote",
        "laugh",
        "hooray",
        "confused",
        "heart",
        "rocket",
        "eyes"
})
@Generated("jsonschema2pojo")
public class GitHubReactions {

    @JsonProperty("url")
    private String url;
    @JsonProperty("total_count")
    private Integer totalCount;
    @JsonProperty("upvote")
    private Integer upvote;
    @JsonProperty("downvote")
    private Integer downvote;
    @JsonProperty("laugh")
    private Integer laugh;
    @JsonProperty("hooray")
    private Integer hooray;
    @JsonProperty("confused")
    private Integer confused;
    @JsonProperty("heart")
    private Integer heart;
    @JsonProperty("rocket")
    private Integer rocket;
    @JsonProperty("eyes")
    private Integer eyes;
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

    @JsonProperty("total_count")
    public Integer getTotalCount() {
        return totalCount;
    }

    @JsonProperty("total_count")
    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @JsonProperty("upvote")
    public Integer getUpvote() {
        return upvote;
    }

    @JsonProperty("upvote")
    public void setUpvote(Integer upvote) {
        this.upvote = upvote;
    }

    @JsonProperty("downvote")
    public Integer getDownvote() {
        return downvote;
    }

    @JsonProperty("downvote")
    public void setDownvote(Integer downvote) {
        this.downvote = downvote;
    }

    @JsonProperty("laugh")
    public Integer getLaugh() {
        return laugh;
    }

    @JsonProperty("laugh")
    public void setLaugh(Integer laugh) {
        this.laugh = laugh;
    }

    @JsonProperty("hooray")
    public Integer getHooray() {
        return hooray;
    }

    @JsonProperty("hooray")
    public void setHooray(Integer hooray) {
        this.hooray = hooray;
    }

    @JsonProperty("confused")
    public Integer getConfused() {
        return confused;
    }

    @JsonProperty("confused")
    public void setConfused(Integer confused) {
        this.confused = confused;
    }

    @JsonProperty("heart")
    public Integer getHeart() {
        return heart;
    }

    @JsonProperty("heart")
    public void setHeart(Integer heart) {
        this.heart = heart;
    }

    @JsonProperty("rocket")
    public Integer getRocket() {
        return rocket;
    }

    @JsonProperty("rocket")
    public void setRocket(Integer rocket) {
        this.rocket = rocket;
    }

    @JsonProperty("eyes")
    public Integer getEyes() {
        return eyes;
    }

    @JsonProperty("eyes")
    public void setEyes(Integer eyes) {
        this.eyes = eyes;
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
        sb.append(GitHubReactions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("totalCount");
        sb.append('=');
        sb.append(((this.totalCount == null)?"<null>":this.totalCount));
        sb.append(',');
        sb.append("upvote");
        sb.append('=');
        sb.append(((this.upvote == null)?"<null>":this.upvote));
        sb.append(',');
        sb.append("downvote");
        sb.append('=');
        sb.append(((this.downvote == null)?"<null>":this.downvote));
        sb.append(',');
        sb.append("laugh");
        sb.append('=');
        sb.append(((this.laugh == null)?"<null>":this.laugh));
        sb.append(',');
        sb.append("hooray");
        sb.append('=');
        sb.append(((this.hooray == null)?"<null>":this.hooray));
        sb.append(',');
        sb.append("confused");
        sb.append('=');
        sb.append(((this.confused == null)?"<null>":this.confused));
        sb.append(',');
        sb.append("heart");
        sb.append('=');
        sb.append(((this.heart == null)?"<null>":this.heart));
        sb.append(',');
        sb.append("rocket");
        sb.append('=');
        sb.append(((this.rocket == null)?"<null>":this.rocket));
        sb.append(',');
        sb.append("eyes");
        sb.append('=');
        sb.append(((this.eyes == null)?"<null>":this.eyes));
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