package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.game.enums.GameResult;
import com.github.sornerol.chess.pubapi.domain.player.enums.MembershipStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class TeamMatchPlayer {
    @JsonProperty("username")
    private String username;

    @JsonProperty("stats")
    private String playerStatsApiUrl;

    @JsonProperty("rating")
    private Integer rating;

    @JsonProperty("timeout_percent")
    private BigDecimal timeoutPercent;

    @JsonProperty("rd")
    private BigDecimal rd;

    @JsonProperty("status")
    private MembershipStatus membershipStatus;

    @JsonProperty("played_as_black")
    private GameResult playedAsBlack;

    @JsonProperty("played_as_white")
    private GameResult playedAsWhite;

    @JsonProperty("board")
    private String boardApiUrl;
}
