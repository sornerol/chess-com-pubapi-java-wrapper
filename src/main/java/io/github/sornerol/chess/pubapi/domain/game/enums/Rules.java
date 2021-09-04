package io.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum Rules {
    CHESS("chess"),
    CHESS960("chess960"),
    BUGHOUSE("bughouse"),
    KING_OF_THE_HILL("kingofthehill"),
    THREE_CHECK("threecheck"),
    CRAZYHOUSE("crazyhouse");

    @Getter
    @JsonValue
    private final String value;

    Rules(String value) {
        this.value = value;
    }
}
