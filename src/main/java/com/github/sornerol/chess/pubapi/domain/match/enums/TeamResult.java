package com.github.sornerol.chess.pubapi.domain.match.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum TeamResult {
    WIN("win"),
    LOSE("lose");

    @Getter
    @JsonValue
    private final String value;

    TeamResult(String value) {
        this.value = value;
    }
}
