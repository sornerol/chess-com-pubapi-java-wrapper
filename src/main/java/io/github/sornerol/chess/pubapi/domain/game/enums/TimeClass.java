package io.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum TimeClass {
    DAILY("daily"),
    RAPID("rapid"),
    BLITZ("blitz"),
    BULLET("bullet");

    @Getter
    @JsonValue
    private final String value;

    TimeClass(String value) {
        this.value = value;
    }
}
