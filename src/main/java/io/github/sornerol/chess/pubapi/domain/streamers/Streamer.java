package io.github.sornerol.chess.pubapi.domain.streamers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Contains information about a Chess.com streamer.
 */
@ToString
@Getter
@Setter
public class Streamer {
    /**
     * The streamer's Chess.com username.
     */
    @JsonProperty("username")
    private String username;

    /**
     * The URL to the player's Chess.com avatar.
     */
    @JsonProperty("avatar")
    private String avatarUrl;

    /**
     * The streamer's Twitch profile URL.
     */
    @JsonProperty("twitch_url")
    private String twitchUrl;

    /**
     * The streamer's Chess.com profile URL.
     */
    @JsonProperty("url")
    private String profileUrl;

    /**
     * Is the streamer live on Twitch?
     */
    @JsonProperty("is_live")
    private Boolean isLive;

    /**
     * Is the streamer a Chess.com Community Streamer?
     * @see <a href=https://www.chess.com/news/view/announcing-community-streamers-chesscom>Announcing Major Additions to Streaming on Chess.com</a>
     */
    @JsonProperty("is_community_streamer")
    private Boolean isCommunityStreamer;

    /**
     * List of streaming platforms associated with this streamer
     */
    @JsonProperty("platforms")
    private List<StreamingPlatform> streamingPlatforms;
}
