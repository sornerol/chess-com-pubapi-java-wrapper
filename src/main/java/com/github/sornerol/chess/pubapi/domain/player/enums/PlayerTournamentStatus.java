package com.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum PlayerTournamentStatus {
    WINNER("winner"),
    ACTIVE("active"),
    REGISTERED("registered"),
    ELIMINATED("eliminated"),
    WITHDREW("withdrew"),
    REMOVED("removed");

    @Getter
    @JsonValue
    private final String value;

    PlayerTournamentStatus(String value) {
        this.value = value;
    }
}
