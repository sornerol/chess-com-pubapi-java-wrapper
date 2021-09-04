package io.github.sornerol.chess.pubapi.domain.match.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum TeamMatchStatus {
    REGISTRATION("registration"),
    IN_PROGRESS("in_progress"),
    FINISHED("finished");

    @Getter
    @JsonValue
    private final String value;

    TeamMatchStatus(String value) {
        this.value = value;
    }
}
