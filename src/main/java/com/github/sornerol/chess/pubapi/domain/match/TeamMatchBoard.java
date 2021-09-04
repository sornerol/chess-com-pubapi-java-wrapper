package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.game.ArchiveGame;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class TeamMatchBoard {
    @JsonProperty("board_scores")
    Map<String, Integer> boardScores;

    @JsonProperty("games")
    List<ArchiveGame> games;
}
