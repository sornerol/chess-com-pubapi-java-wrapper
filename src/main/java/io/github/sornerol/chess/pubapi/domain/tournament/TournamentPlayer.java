package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.player.enums.PlayerTournamentStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Details about a player in a tournament
 */
@Getter
@Setter
@ToString
public class TournamentPlayer {
    /**
     * Player's username
     */
    @JsonProperty("username")
    private String username;

    /**
     * Player's status
     */
    @JsonProperty("status")
    private PlayerTournamentStatus status;

    /**
     * Whether the player is advancing
     */
    @JsonProperty("is_advancing")
    private Boolean isAdvancing;

    /**
     * Number of points scored by the player
     */
    @JsonProperty("points")
    private BigDecimal points;

    /**
     * Number of tiebreak points for the player
     */
    @JsonProperty("tie_break")
    private BigDecimal tiebreak;
}
