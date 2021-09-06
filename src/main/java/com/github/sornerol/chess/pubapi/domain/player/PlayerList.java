package com.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for getting a list of player usernames
 */
@Getter
@Setter
@ToString
public class PlayerList {
    /**
     * List of player usernames
     */
    @JsonProperty("players")
    private List<String> players;
}
