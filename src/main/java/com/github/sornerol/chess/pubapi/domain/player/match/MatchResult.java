package com.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MatchResult {
    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("club")
    private String clubApiUrl;

    @JsonProperty("results")
    private Results results;

    @JsonProperty("board")
    private String boardApiUrl;
}
