package io.github.sornerol.chess.pubapi.domain.tournament.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum TournamentStatus {
    FINISHED("finished"),
    IN_PROGRESS("in_progress"),
    REGISTRATION("registration");

    @Getter
    @JsonValue
    private final String value;

    TournamentStatus(String value) {
        this.value = value;
    }
}
