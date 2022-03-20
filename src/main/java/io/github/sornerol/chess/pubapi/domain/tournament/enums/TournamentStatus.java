package io.github.sornerol.chess.pubapi.domain.tournament.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible tournament statuses
 */
public enum TournamentStatus {
    /**
     * The tournament has concluded
     */
    FINISHED("finished"),

    /**
     * The tournament has started and is in progress
     */
    IN_PROGRESS("in_progress"),

    /**
     * The tournament is accepting registrants.
     */
    REGISTRATION("registration");

    @Getter
    @JsonValue
    private final String value;

    TournamentStatus(String value) {
        this.value = value;
    }
}
