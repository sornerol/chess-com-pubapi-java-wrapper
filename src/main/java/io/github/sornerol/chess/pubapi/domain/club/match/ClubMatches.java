package io.github.sornerol.chess.pubapi.domain.club.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ClubMatches {
    @JsonProperty("finished")
    private List<ClubMatch> finished;

    @JsonProperty("in_progress")
    private List<ClubMatch> inProgress;

    @JsonProperty("registered")
    private List<ClubMatch> registered;
}
