package com.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.game.enums.GameResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Wrapper class for team match results as white and black
 */
@Getter
@Setter
@ToString
public class Results {
    /**
     * Player's result as white
     */
    @JsonProperty("played_as_white")
    private GameResult playedAsWhite;

    /**
     * Player's result as black
     */
    @JsonProperty("played_as_black")
    private GameResult playedAsBlack;
}
