package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Rating details for learning categories, such as puzzles and lessons
 */
@Getter
@Setter
@ToString
public class LearningStats {
    /**
     * Highest rating details
     */
    @JsonProperty("highest")
    private Rating highest;

    /**
     * Lowest rating details
     */
    @JsonProperty("lowest")
    private Rating lowest;
}
