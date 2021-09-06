package com.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.game.enums.GamePlayer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Information about a daily chess game that is in progress
 */
@Getter
@Setter
@ToString(callSuper = true)
public class Game extends GameBase {
    /**
     * Timestamp of when the next move must be made in epoch time (seconds)
     */
    @JsonProperty("move_by")
    private Long moveBy;

    /**
     * Timestamp of the last activity on the game in epoch time (seconds)
     */
    @JsonProperty("last_activity")
    private Long lastActivity;

    /**
     * The player whose turn it is
     */
    @JsonProperty("turn")
    private GamePlayer turn;

    /**
     * Link to white's PubAPI profile
     */
    @JsonProperty("white")
    private String whiteApiUrl;

    /**
     * Link to black's PubAPI profile
     */
    @JsonProperty("black")
    private String blackApiUrl;

    /**
     * The player who has made a draw offer
     */
    @JsonProperty("draw_offer")
    private GamePlayer drawOffer;
}
