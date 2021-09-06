package com.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for list of active club members
 */
@Getter
@Setter
@ToString
public class ClubMembers {
    /**
     * Most active club members for the week
     */
    @JsonProperty("weekly")
    private List<ClubMember> weekly;

    /**
     * Most active club members for the month
     */
    @JsonProperty("monthly")
    private List<ClubMember> monthly;

    /**
     * All-time most active club members
     */
    @JsonProperty("all_time")
    private List<ClubMember> allTime;
}
