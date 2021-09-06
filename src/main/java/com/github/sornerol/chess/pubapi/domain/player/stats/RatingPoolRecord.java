package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import java.math.BigDecimal;

/**
 * Details about a player's win/loss/draw record for a particular rating pool
 */
@Getter
@Setter
@ToString
public class RatingPoolRecord {
    /**
     * Number of games won
     */
    @JsonProperty("win")
    private Integer win;

    /**
     * Number of games lost
     */
    @JsonProperty("loss")
    private Integer loss;

    /**
     * Number of games drawn
     */
    @JsonProperty("draw")
    private Integer draw;

    /**
     * Players average time per move in daily games, in seconds
     */
    @JsonProperty("time_per_move")
    private Integer timePerMove;

    /**
     * Player's daily game timeout percentage
     */
    @JsonProperty("timeout_percent")
    private BigDecimal timeoutPercent;
}
