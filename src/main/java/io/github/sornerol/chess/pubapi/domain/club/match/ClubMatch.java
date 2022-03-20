package io.github.sornerol.chess.pubapi.domain.club.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.TimeClass;
import io.github.sornerol.chess.pubapi.domain.match.enums.TeamResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Represents details about a club's team match results
 */
@Getter
@Setter
@ToString
public class ClubMatch {
    /**
     * Team match name
     */
    @JsonProperty("name")
    private String name;

    /**
     * PubAPI URL for the team match
     */
    @JsonProperty("@id")
    private String teamMatchApiUrl;

    /**
     * PubAPI URL for the opponent team's club
     */
    @JsonProperty("opponent")
    private String opponentClubApiUrl;

    /**
     * Team's result
     */
    @JsonProperty("result")
    private TeamResult result;

    /**
     * Match start timestamp as epoch time (seconds)
     */
    @JsonProperty("start_time")
    private Long startTime;

    /**
     * The Time class for the tournament
     */
    @JsonProperty("time_class")
    private TimeClass timeClass;
}
