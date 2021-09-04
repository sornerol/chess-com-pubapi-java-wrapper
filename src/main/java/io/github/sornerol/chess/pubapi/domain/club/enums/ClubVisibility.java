package io.github.sornerol.chess.pubapi.domain.club.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum ClubVisibility {
    PUBLIC("public"),
    PRIVATE("private");

    @Getter
    @JsonValue
    private final String value;

    ClubVisibility(String value) {
        this.value = value;
    }
}
