package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.game.enums.Rules;
import com.github.sornerol.chess.pubapi.domain.game.enums.TimeClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TeamMatchSettings {
    @JsonProperty("time_class")
    private TimeClass timeClass;

    @JsonProperty("time_control")
    private String timeControl;

    @JsonProperty("time_increment")
    private Integer timeIncrementInSeconds;

    @JsonProperty("initial_setup")
    private String initialSetupFen;

    @JsonProperty("rules")
    private Rules rules;

    @JsonProperty("min_team_players")
    private Integer minTeamPlayers;

    @JsonProperty("max_team_players")
    private Integer maxTeamPlayers;

    @JsonProperty("min_required_games")
    private Integer minRequiredGames;

    @JsonProperty("min_rating")
    private Integer minRating;

    @JsonProperty("max_rating")
    private Integer maxRating;

    @JsonProperty("autostart")
    private Boolean autostart;
}
