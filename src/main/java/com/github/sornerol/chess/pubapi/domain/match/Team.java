package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.match.enums.TeamResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
public class Team {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    @JsonProperty("score")
    private BigDecimal score;

    @JsonProperty("result")
    private TeamResult result;

    @JsonProperty("players")
    private List<TeamMatchPlayer> players;

    @JsonProperty("fair_play_removals")
    private List<String> fairPlayRemovals;

    @JsonProperty("locked")
    private Boolean locked;
}
