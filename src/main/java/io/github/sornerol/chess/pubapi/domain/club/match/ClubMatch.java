package io.github.sornerol.chess.pubapi.domain.club.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClubMatch {
    @JsonProperty("name")
    private String name;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("opponent")
    private String opponentClubApiUrl;

    @JsonProperty("result")
    private String result;

    @JsonProperty("start_time")
    private Long startTime;

    @JsonProperty("time_class")
    private String timeClass;
}
