package com.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.match.enums.TeamMatchStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TeamMatch {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    @JsonProperty("description")
    private String description;

    @JsonProperty("start_time")
    private Long startTime;

    @JsonProperty("end_time")
    private Long endTime;

    @JsonProperty("settings")
    private TeamMatchSettings settings;

    @JsonProperty("status")
    private TeamMatchStatus status;

    @JsonProperty("boards")
    private Integer boards;

    @JsonProperty("teams")
    private Teams teams;
}
