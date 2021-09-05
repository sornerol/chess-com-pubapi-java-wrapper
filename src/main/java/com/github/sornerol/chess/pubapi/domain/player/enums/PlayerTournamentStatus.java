package com.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible statuses for a player in a tournament
 */
public enum PlayerTournamentStatus {
    /**
     * Player is the winner of the tournament
     */
    WINNER("winner"),

    /**
     * Player is currently playing in the tournament
     */
    ACTIVE("active"),

    /**
     * Player is registered for a tournament that hasn't started yet
     */
    REGISTERED("registered"),

    /**
     * Player was eliminated from the tournament
     */
    ELIMINATED("eliminated"),

    /**
     * Player withrew from the tournament
     */
    WITHDREW("withdrew"),

    /**
     * Player was removed from the tournament by the tournament director
     */
    REMOVED("removed");

    @Getter
    @JsonValue
    private final String value;

    PlayerTournamentStatus(String value) {
        this.value = value;
    }
}
