package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.match.enums.TeamResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;

/**
 * Details about a team in a team match
 */
@Getter
@Setter
@ToString
public class Team {
    /**
     * Link to club's PubAPI profile
     */
    @JsonProperty("@id")
    private String clubApiUrl;

    /**
     * Club's name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Link to club's profile on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Team's score
     */
    @JsonProperty("score")
    private BigDecimal score;

    /**
     * Team's result
     */
    @JsonProperty("result")
    private TeamResult result;

    /**
     * List of team's players for this match
     */
    @JsonProperty("players")
    private List<TeamMatchPlayer> players;

    /**
     * List of usernames of team members removed for fair play violations
     */
    @JsonProperty("fair_play_removals")
    private List<String> fairPlayRemovals;

    /**
     * Whether the team's registration is locked
     */
    @JsonProperty("locked")
    private Boolean locked;
}
