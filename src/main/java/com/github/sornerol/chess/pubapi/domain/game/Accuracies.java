package com.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Accuracy percentages for White and Black in a game
 */
@Getter
@Setter
@ToString
public class Accuracies {
    /**
     * White's accuracy percentage
     */
    @JsonProperty("white")
    private BigDecimal white;

    /**
     * Black's accuracy percentage
     */
    @JsonProperty("black")
    private BigDecimal black;
}
