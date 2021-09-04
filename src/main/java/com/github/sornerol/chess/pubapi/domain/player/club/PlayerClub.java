package com.github.sornerol.chess.pubapi.domain.player.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerClub {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("last_activity")
    private Long lastActivity;

    @JsonProperty("icon")
    private String iconUrl;

    @JsonProperty("url")
    private String url;

    @JsonProperty("joined")
    private Long joined;
}
