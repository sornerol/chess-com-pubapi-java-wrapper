package io.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum GameResult {
    WIN("win"),
    CHECKMATED("checkmated"),
    AGREED("agreed"),
    REPETITION("repetition"),
    TIMEOUT("timeout"),
    RESIGNED("resigned"),
    STALEMATE("stalemate"),
    LOSE("lose"),
    INSUFFICIENT("insufficient"),
    FIFTY_MOVE("50move"),
    ABANDONED("abandoned"),
    KING_OF_THE_HILL("kingofthehill"),
    THREE_CHECK("threecheck"),
    TIME_VS_INSUFFICIENT("timevsinsufficient"),
    BUGHOUSE_PARTNER_LOSE("bughousepartnerlose");

    @Getter
    @JsonValue
    private final String value;

    GameResult(String value) {
        this.value = value;
    }
}
