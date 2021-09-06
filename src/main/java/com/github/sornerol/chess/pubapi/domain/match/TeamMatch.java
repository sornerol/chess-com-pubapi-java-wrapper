package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.match.enums.TeamMatchStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Details about a team match
 */
@Getter
@Setter
@ToString
public class TeamMatch {
    /**
     * Self-referencing PubAPI URL for this team match
     */
    @JsonProperty("@id")
    private String id;

    /**
     * Team match name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Team match web page URL on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Team match description
     */
    @JsonProperty("description")
    private String description;

    /**
     * Match start timestamp in epoch time (seconds)
     */
    @JsonProperty("start_time")
    private Long startTime;

    /**
     * Match end timestamp in epoch time (seconds)
     */
    @JsonProperty("end_time")
    private Long endTime;

    /**
     * Details about the team match's setup
     */
    @JsonProperty("settings")
    private TeamMatchSettings settings;

    /**
     * Status of the team match
     */
    @JsonProperty("status")
    private TeamMatchStatus status;

    /**
     * Number of boards for the team match
     */
    @JsonProperty("boards")
    private Integer boards;

    /**
     * The two teams involved in this match
     */
    @JsonProperty("teams")
    private Teams teams;
}
