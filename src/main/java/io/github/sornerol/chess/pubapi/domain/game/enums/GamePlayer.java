package io.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Used to represent a player in a game (white or black)
 */
public enum GamePlayer {
    /**
     * The white player
     */
    WHITE("white"),
    /**
     * The black player
     */
    BLACK("black");

    @Getter
    @JsonValue
    private final String value;

    GamePlayer(String value) {
        this.value = value;
    }
}
