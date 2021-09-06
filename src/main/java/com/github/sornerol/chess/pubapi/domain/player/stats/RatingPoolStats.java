package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Player's statistics for a particular rating pool
 */
@Getter
@Setter
@ToString
public class RatingPoolStats {
    /**
     * Player's last rating details
     */
    @JsonProperty("last")
    private Rating last;

    /**
     * Player's best rating details
     */
    @JsonProperty("best")
    private Rating best;

    /**
     * Player's win/loss/draw record
     */
    @JsonProperty("record")
    private RatingPoolRecord record;

    /**
     * Players tournament statistics
     */
    @JsonProperty("tournament")
    private TournamentStats tournament;
}
