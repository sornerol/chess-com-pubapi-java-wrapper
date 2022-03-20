package io.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.Rules;
import io.github.sornerol.chess.pubapi.domain.game.enums.TimeClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Details about a team match's configuration
 */
@Getter
@Setter
@ToString
public class TeamMatchSettings {
    /**
     * Time class for the match's games
     */
    @JsonProperty("time_class")
    private TimeClass timeClass;

    /**
     * Time control for the match's games
     */
    @JsonProperty("time_control")
    private String timeControl;

    /**
     * Time increment in seconds
     */
    @JsonProperty("time_increment")
    private Integer timeIncrementInSeconds;

    /**
     * FEN string representing the starting position for the match's games
     */
    @JsonProperty("initial_setup")
    private String initialSetupFen;

    /**
     * Chess variant used for this team match
     */
    @JsonProperty("rules")
    private Rules rules;

    /**
     * Minimum number of players needed for each team
     */
    @JsonProperty("min_team_players")
    private Integer minTeamPlayers;

    /**
     * Maximum number of players allowed for each team
     */
    @JsonProperty("max_team_players")
    private Integer maxTeamPlayers;

    /**
     * Minimum number of completed games for a player to be able to join
     */
    @JsonProperty("min_required_games")
    private Integer minRequiredGames;

    /**
     * Minimum player rating
     */
    @JsonProperty("min_rating")
    private Integer minRating;

    /**
     * Maximum player rating
     */
    @JsonProperty("max_rating")
    private Integer maxRating;

    /**
     * Should the match automatically start
     */
    @JsonProperty("autostart")
    private Boolean autostart;
}
