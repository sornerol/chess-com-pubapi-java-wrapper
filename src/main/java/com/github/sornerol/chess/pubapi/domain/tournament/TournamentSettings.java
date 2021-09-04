package com.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TournamentSettings {

    @JsonProperty("type")
    private String type;

    @JsonProperty("rules")
    private String rules;

    @JsonProperty("time_class")
    private String timeClass;

    @JsonProperty("time_control")
    private String timeControl;

    @JsonProperty("is_rated")
    private Boolean isRated;

    @JsonProperty("is_official")
    private Boolean isOfficial;

    @JsonProperty("is_invite_only")
    private Boolean isInviteOnly;

    @JsonProperty("min_rating")
    private Integer minRating;

    @JsonProperty("max_rating")
    private Integer maxRating;

    @JsonProperty("initial_group_size")
    private Integer initialGroupSize;

    @JsonProperty("user_advance_count")
    private String userAdvanceCount;

    @JsonProperty("use_tiebreak")
    private Boolean useTiebreak;

    @JsonProperty("allow_vacation")
    private Boolean allowVacation;

    @JsonProperty("winner_places")
    private Integer winnerPlaces;

    @JsonProperty("registered_user_count")
    private Integer registeredUserCount;

    @JsonProperty("games_per_opponent")
    private Integer gamesPerOpponent;

    @JsonProperty("total_rounds")
    private Integer totalRounds;

    @JsonProperty("concurrent_games_per_opponent")
    private Integer concurrentGamesPerOpponent;
}
