package com.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for retrieving a list of archive games
 */
@Getter
@Setter
@ToString
public class ArchiveGameList {
    /**
     * List of archive games
     */
    @JsonProperty("games")
   private List<ArchiveGame> games;
}
