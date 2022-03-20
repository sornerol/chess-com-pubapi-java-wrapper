package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.ArchiveGame;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Details about a player group in a tournament round
 */
@Getter
@Setter
@ToString
public class TournamentRoundGroup {
    /**
     * List of player usernames removed for fair play violations
     */
    @JsonProperty("fair_play_removals")
    private List<String> fairPlayRemovals;

    /**
     * List of games for the tournament group
     */
    @JsonProperty("games")
    private List<ArchiveGame> games;

    /**
     * List of players in the tournament group
     */
    @JsonProperty("players")
    private List<TournamentPlayer> players;
}

