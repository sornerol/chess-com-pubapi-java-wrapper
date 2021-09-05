package com.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * FIDE and national federation titles recognized by Chess.com
 * @see <a href="https://www.chess.com/terms/chess-titles">"Chess Titles" on Chess.com</a>
 */
public enum Title {
    /**
     * Grandmaster
     */
    GM("GM"),

    /**
     * Woman Grandmaster
     */
    WGM("WGM"),

    /**
     * International Master
     */
    IM("IM"),

    /**
     * Woman International Master
     */
    WIM("WIM"),

    /**
     * FIDE master
     */
    FM("FM"),

    /**
     * Woman FIDE master
     */
    WFM("WFM"),

    /**
     * National master
     */
    NM("NM"),

    /**
     * Woman national master
     */
    WNM("WNM"),

    /**
     * Candidate master
     */
    CM("CM"),

    /**
     * Woman candidate master
     */
    WCM("WCM");

    @Getter
    @JsonValue
    private final String value;

    Title(String value) {
        this.value = value;
    }
}
