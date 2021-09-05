package com.github.sornerol.chess.pubapi.domain.match.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible team match statuses
 */
public enum TeamMatchStatus {
    /**
     * The team match has concluded
     */
    FINISHED("finished"),

    /**
     * The team match has started and is in progress
     */
    IN_PROGRESS("in_progress"),

    /**
     * The team match is accepting registrants.
     */
    REGISTRATION("registration");

    @Getter
    @JsonValue
    private final String value;

    TeamMatchStatus(String value) {
        this.value = value;
    }
}
