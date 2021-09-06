package com.github.sornerol.chess.pubapi.domain.match.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible team match results
 */
public enum TeamResult {
    /**
     * Team won
     */
    WIN("win"),

    /**
     * Team lost
     */
    LOSE("lose"),

    /**
     * Teams tied
     */
    DRAW("draw");

    @Getter
    @JsonValue
    private final String value;

    TeamResult(String value) {
        this.value = value;
    }
}
