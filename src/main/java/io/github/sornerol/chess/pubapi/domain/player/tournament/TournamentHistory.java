package io.github.sornerol.chess.pubapi.domain.player.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for player's tournament participation history
 */
@Getter
@Setter
@ToString
public class TournamentHistory {
    /**
     * List of finished tournaments
     */
    @JsonProperty("finished")
    List<TournamentResult> finished;

    /**
     * List of tournaments in progress
     */
    @JsonProperty("in_progress")
    List<TournamentResult> inProgress;

    /**
     * List of tournaments player has registered for
     */
    @JsonProperty("registered")
    List<TournamentResult> registered;
}
