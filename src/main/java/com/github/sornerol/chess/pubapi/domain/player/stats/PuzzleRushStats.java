package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Wrapper class for puzzle rush statistics
 */
@Getter
@Setter
@ToString
public class PuzzleRushStats {
    /**
     * Details about player's best puzzle rush score
     */
    @JsonProperty("best")
    private PuzzleRushStatistic best;
}
