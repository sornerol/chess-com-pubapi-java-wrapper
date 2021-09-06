package com.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Details about a player's team match result
 */
@Getter
@Setter
@ToString
public class MatchResult {
    /**
     * Team match name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Link to web page of team match on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Link to PubAPI profile for team match
     */
    @JsonProperty("@id")
    private String teamMatchApiUrl;

    /**
     * Link to PubAPI profile for the player's club
     */
    @JsonProperty("club")
    private String clubApiUrl;

    /**
     * The players game results as white and black
     */
    @JsonProperty("results")
    private Results results;

    /**
     * Link to PubAPI profile for the team match board
     */
    @JsonProperty("board")
    private String boardApiUrl;
}
