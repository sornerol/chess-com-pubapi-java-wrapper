package io.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum MembershipStatus {
    BASIC("basic"),
    PREMIUM("premium"),
    MOD("mod"),
    STAFF("staff");

    @Getter
    @JsonValue
    private final String value;

    MembershipStatus(String value) {
        this.value = value;
    }
}
