package com.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible game results for a player
 */
public enum GameResult {
    /**
     * Player won
     */
    WIN("win"),

    /**
     * Player lost by checkmate
     */
    CHECKMATED("checkmated"),

    /**
     * Game drawn by agreement
     */
    AGREED("agreed"),

    /**
     * Game drawn by repetition
     */
    REPETITION("repetition"),

    /**
     * Player lost on time
     */
    TIMEOUT("timeout"),

    /**
     * Player lost by resignation
     */
    RESIGNED("resigned"),

    /**
     * Game drawn by stalemate
     */
    STALEMATE("stalemate"),

    /**
     * Player lost for unknown reason
     */
    LOSE("lose"),

    /**
     * Game drawn due to insufficient material
     */
    INSUFFICIENT("insufficient"),

    /**
     * Game drawn due to 50-move rule
     */
    FIFTY_MOVE("50move"),

    /**
     * Player abandoned game
     */
    ABANDONED("abandoned"),

    /**
     * Player won king of the hill
     */
    KING_OF_THE_HILL("kingofthehill"),

    /**
     * Player won three-check game
     */
    THREE_CHECK("threecheck"),

    /**
     * Game drawn by timeout vs insufficient material
     */
    TIME_VS_INSUFFICIENT("timevsinsufficient"),

    /**
     * Player's bughouse partner lost
     */
    BUGHOUSE_PARTNER_LOSE("bughousepartnerlose");

    @Getter
    @JsonValue
    private final String value;

    GameResult(String value) {
        this.value = value;
    }
}
