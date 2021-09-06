package com.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.game.enums.Rules;
import com.github.sornerol.chess.pubapi.domain.game.enums.TimeClass;
import com.github.sornerol.chess.pubapi.domain.tournament.enums.TournamentType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Details about a tournament's settings
 */
@Getter
@Setter
@ToString
public class TournamentSettings {
    /**
     * Tournament type
     */
    @JsonProperty("type")
    private TournamentType type;

    /**
     * Chess rules variant
     */
    @JsonProperty("rules")
    private Rules rules;

    /**
     * Tournament's time class
     */
    @JsonProperty("time_class")
    private TimeClass timeClass;

    /**
     * Tournament's time control
     */
    @JsonProperty("time_control")
    private String timeControl;

    /**
     * Whether the tournament's games are rated
     */
    @JsonProperty("is_rated")
    private Boolean isRated;

    /**
     * Whether the tournament is an official Chess.com tournament
     */
    @JsonProperty("is_official")
    private Boolean isOfficial;

    /**
     * Whether the tournament is invite-only
     */
    @JsonProperty("is_invite_only")
    private Boolean isInviteOnly;

    /**
     * Minimum rating required to join the tournament
     */
    @JsonProperty("min_rating")
    private Integer minRating;

    /**
     * Maximum rating required to join the tournament
     */
    @JsonProperty("max_rating")
    private Integer maxRating;

    /**
     * Initial group size for a round-robin knockout tournament
     */
    @JsonProperty("initial_group_size")
    private Integer initialGroupSize;

    /**
     * Number of players who advance to the next round in a round-robin knockout tournament
     */
    @JsonProperty("user_advance_count")
    private String userAdvanceCount;

    /**
     * Whether to use tiebreaks
     */
    @JsonProperty("use_tiebreak")
    private Boolean useTiebreak;

    /**
     * Whether daily tournament games can be paused for player vacation
     */
    @JsonProperty("allow_vacation")
    private Boolean allowVacation;

    /**
     * Number of winner places
     */
    @JsonProperty("winner_places")
    private Integer winnerPlaces;

    /**
     * Number of players registered
     */
    @JsonProperty("registered_user_count")
    private Integer registeredUserCount;

    /**
     * Number of games to play per opponent
     */
    @JsonProperty("games_per_opponent")
    private Integer gamesPerOpponent;

    /**
     * Total number of rounds for the tournament
     */
    @JsonProperty("total_rounds")
    private Integer totalRounds;

    /**
     * Number of concurrent games per opponent
     */
    @JsonProperty("concurrent_games_per_opponent")
    private Integer concurrentGamesPerOpponent;
}
