package com.github.sornerol.chess.pubapi.domain.streamers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Streamer {
    @JsonProperty("username")
    private String username;

    @JsonProperty("avatar")
    private String avatarUrl;

    @JsonProperty("twitch_url")
    private String twitchUrl;

    @JsonProperty("url")
    private String profileUrl;

    @JsonProperty("is_live")
    private Boolean isLive;
}
