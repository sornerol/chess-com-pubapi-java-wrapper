package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Statistics for puzzle rush
 */
@Getter
@Setter
@ToString
public class PuzzleRushStatistic {
    /**
     * Total puzzle rush attempts
     */
    @JsonProperty("total_attempts")
    private Integer totalAttempts;

    /**
     * Player's best puzzle rush score
     */
    @JsonProperty("score")
    private Integer score;
}
