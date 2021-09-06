package com.github.sornerol.chess.pubapi.domain.tournament.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible tournament types
 */
public enum TournamentType {
    STANDARD("standard"),
    ARENA("arena"),
    SWISS("swiss"),
    ROUND_ROBIN("round_robin");

    @Getter
    @JsonValue
    private final String value;

    TournamentType(String value) {
        this.value = value;
    }
}
