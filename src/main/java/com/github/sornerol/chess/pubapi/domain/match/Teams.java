package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Teams {
    @JsonProperty("team1")
    private Team team1;

    @JsonProperty("team2")
    private Team team2;
}
