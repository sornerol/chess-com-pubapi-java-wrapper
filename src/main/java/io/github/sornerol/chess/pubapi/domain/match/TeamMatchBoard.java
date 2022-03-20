package io.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.ArchiveGame;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Information about a team match board
 */
@Getter
@Setter
@ToString
public class TeamMatchBoard {
    /**
     * Match scores for each player. The map key is the player username, and the value is the player's score
     */
    @JsonProperty("board_scores")
    Map<String, BigDecimal> boardScores;

    /**
     * List of games for this team match board
     */
    @JsonProperty("games")
    List<ArchiveGame> games;
}
