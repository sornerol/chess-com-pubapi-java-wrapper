package io.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible user membership statuses
 */
public enum MembershipStatus {
    /**
     * User has a free account
     */
    BASIC("basic"),

    /**
     * User has an active paid membership
     */
    PREMIUM("premium"),

    /**
     * Chess.com moderator
     */
    MOD("mod"),

    /**
     * Account is closed by player's request
     */
    CLOSED("closed"),

    /**
     * Account is closed due to fair play violations
     */
    CLOSED_FAIR_PLAY("closed:fair_play_violations"),

    /**
     * Chess.com staff
     */
    STAFF("staff");

    @Getter
    @JsonValue
    private final String value;

    MembershipStatus(String value) {
        this.value = value;
    }
}
