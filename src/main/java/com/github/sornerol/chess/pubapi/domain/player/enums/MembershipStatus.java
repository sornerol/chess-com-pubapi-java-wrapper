package com.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum MembershipStatus {
    BASIC("basic"),
    PREMIUM("premium"),
    MOD("mod"),
    CLOSED("closed"),
    CLOSED_FAIR_PLAY("closed:fair_play_violations"),
    STAFF("staff");

    @Getter
    @JsonValue
    private final String value;

    MembershipStatus(String value) {
        this.value = value;
    }
}
