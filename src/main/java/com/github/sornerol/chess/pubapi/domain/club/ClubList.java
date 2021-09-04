package com.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ClubList {
    @JsonProperty("clubs")
    List<String> clubsApiUrls;
}
