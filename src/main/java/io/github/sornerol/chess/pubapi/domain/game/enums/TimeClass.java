package io.github.sornerol.chess.pubapi.domain.game.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

/**
 * Possible time classes for games
 * @see <a href="https://www.chess.com/terms/chess-time-controls">"Chess Time Controls" on Chess.com</a>
 */
public enum TimeClass {
    /**
     * Daily (1 to 14 days/move)
     */
    DAILY("daily"),

    /**
     * Rapid (greater than 10 minutes/player)
     */
    RAPID("rapid"),

    /**
     * Blitz (3 to 10 minutes/player)
     */
    BLITZ("blitz"),

    /**
     * Bullet (less than 3 minutes/player)
     */
    BULLET("bullet");

    @Getter
    @JsonValue
    private final String value;

    TimeClass(String value) {
        this.value = value;
    }
}
