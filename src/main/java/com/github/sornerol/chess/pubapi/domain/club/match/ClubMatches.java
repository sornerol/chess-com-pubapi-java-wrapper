package com.github.sornerol.chess.pubapi.domain.club.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for a club's team match history.
 */
@Getter
@Setter
@ToString
public class ClubMatches {
    /**
     * Finished team matches
     */
    @JsonProperty("finished")
    private List<ClubMatch> finished;

    /**
     * Team matches in progress
     */
    @JsonProperty("in_progress")
    private List<ClubMatch> inProgress;

    /**
     * Team matches that are accepting registrants
     */
    @JsonProperty("registered")
    private List<ClubMatch> registered;
}
