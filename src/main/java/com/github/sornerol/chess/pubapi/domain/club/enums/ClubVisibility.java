package com.github.sornerol.chess.pubapi.domain.club.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible club visibility statuses
 */
public enum ClubVisibility {
    /**
     * Club is visible to the public
     */
    PUBLIC("public"),

    /**
     * Club information is only visible to club members
     */
    PRIVATE("private");

    @Getter
    @JsonValue
    private final String value;

    ClubVisibility(String value) {
        this.value = value;
    }
}
