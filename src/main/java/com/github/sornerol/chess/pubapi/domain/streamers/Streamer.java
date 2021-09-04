package com.github.sornerol.chess.pubapi.domain.streamers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
}
