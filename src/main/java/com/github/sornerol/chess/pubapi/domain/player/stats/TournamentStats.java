package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Statistics about player's tournament participation
 */
@Getter
@Setter
@ToString
public class TournamentStats {
    /**
     * Total points earned by player in all tournaments
     */
    @JsonProperty("points")
    private Integer points;

    /**
     * Number of times player has withdrawn from a tournament
     */
    @JsonProperty("withdraw")
    private Integer withdraw;

    /**
     * Total number of tournaments player has participated in
     */
    @JsonProperty("count")
    private Integer count;

    /**
     * Player's best finishing place
     */
    @JsonProperty("highest_finish")
    private Integer highestFinish;
}
