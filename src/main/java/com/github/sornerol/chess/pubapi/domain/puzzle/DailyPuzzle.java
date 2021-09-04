package com.github.sornerol.chess.pubapi.domain.puzzle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class DailyPuzzle {

    @JsonProperty("title")
    private String title;

    @JsonProperty("comments")
    private String comments;

    @JsonProperty("url")
    private String url;

    @JsonProperty("publish_time")
    private Long publishTime;

    @JsonProperty("fen")
    private String fen;

    @JsonProperty("pgn")
    private String pgn;

    @JsonProperty("image")
    private String imageUrl;

}
