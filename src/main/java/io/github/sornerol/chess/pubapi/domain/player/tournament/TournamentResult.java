package io.github.sornerol.chess.pubapi.domain.player.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.TimeClass;
import io.github.sornerol.chess.pubapi.domain.player.enums.PlayerTournamentStatus;
import io.github.sornerol.chess.pubapi.domain.tournament.enums.TournamentType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Details about a player's participation in a particular tournament
 */
@Getter
@Setter
@ToString
public class TournamentResult {
    /**
     * Link to tournament's web page on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Link to tournament's PubAPI profile
     */
    @JsonProperty("@id")
    private String tournamentApiUrl;

    /**
     * Number of wins for player in tournament
     */
    @JsonProperty("wins")
    private Integer wins;

    /**
     * Number of losses for player in tournament
     */
    @JsonProperty("losses")
    private Integer losses;

    /**
     * Number of draws for player in tournament
     */
    @JsonProperty("draws")
    private Integer draws;

    /**
     * Number of points scored by player in tournament
     */
    @JsonProperty("points_awarded")
    private Integer pointsAwarded;

    /**
     * Players place in the tournament
     */
    @JsonProperty("placement")
    private Integer placement;

    /**
     * Player's status in the tournament
     */
    @JsonProperty("status")
    private PlayerTournamentStatus status;

    /**
     * Total number of players in the tournament
     */
    @JsonProperty("total_players")
    private Integer totalPlayers;

    /**
     * Time class for the tournament
     */
    @JsonProperty("time_class")
    private TimeClass timeClass;

    /**
     * Tournament type
     */
    @JsonProperty("type")
    private TournamentType type;
}
