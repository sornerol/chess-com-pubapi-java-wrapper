package com.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for retrieving a list of games
 */
@Getter
@Setter
@ToString
public class GameList {
    /**
     * List of games
     */
    @JsonProperty("games")
    private List<Game> games;
}
