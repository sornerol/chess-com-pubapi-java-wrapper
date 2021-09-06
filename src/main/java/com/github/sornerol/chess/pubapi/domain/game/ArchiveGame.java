package com.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Information about a completed game
 */
@Getter
@Setter
@ToString(callSuper = true)
public class ArchiveGame extends GameBase {
    /**
     * White's player details
     */
    @JsonProperty("white")
    private PlayerDetail white;

    /**
     * Black's player details
     */
    @JsonProperty("black")
    private PlayerDetail black;

    /**
     * Game end timestamp as epoch time (seconds)
     */
    @JsonProperty("end_time")
    private Long endTime;

    /**
     * A Link to the game's opening on www.chess.com
     */
    @JsonProperty("eco")
    private String ecoUrl;

    /**
     * White and black's accuracy percentages
     */
    @JsonProperty("accuracies")
    private Accuracies accuracies;
}
