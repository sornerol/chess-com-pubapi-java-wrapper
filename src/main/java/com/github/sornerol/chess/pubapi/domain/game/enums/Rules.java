package com.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible chess variants/rulesets
 * @see <a href="https://www.chess.com/terms/chess-variants">"Chess Variants" on Chess.com</a>
 */
public enum Rules {
    /**
     * Standard chess
     */
    CHESS("chess"),

    /**
     * Chess960, a.k.a. Fischer Random chess
     */
    CHESS960("chess960"),

    /**
     * Bughouse
     */
    BUGHOUSE("bughouse"),

    /**
     * King of the hill
     */
    KING_OF_THE_HILL("kingofthehill"),

    /**
     * Three-check
     */
    THREE_CHECK("threecheck"),

    /**
     * Crazyhouse
     */
    CRAZYHOUSE("crazyhouse");

    @Getter
    @JsonValue
    private final String value;

    Rules(String value) {
        this.value = value;
    }
}
