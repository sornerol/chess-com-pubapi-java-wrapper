package com.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ClubMembers {
    @JsonProperty("weekly")
    private List<ClubMember> weekly;

    @JsonProperty("monthly")
    private List<ClubMember> monthly;

    @JsonProperty("all_time")
    private List<ClubMember> allTime;
}
