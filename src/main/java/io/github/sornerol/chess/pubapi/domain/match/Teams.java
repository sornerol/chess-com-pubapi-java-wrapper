package io.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Wrapper class for team details for the two teams of a match
 */
@Getter
@Setter
@ToString
public class Teams {
    /**
     * Team 1's details
     */
    @JsonProperty("team1")
    private Team team1;

    /**
     * Team 2's details
     */
    @JsonProperty("team2")
    private Team team2;
}
