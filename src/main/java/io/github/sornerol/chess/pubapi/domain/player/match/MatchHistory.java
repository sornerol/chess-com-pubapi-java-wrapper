package io.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class MatchHistory {
    @JsonProperty("finished")
    private List<MatchResult> finished;

    @JsonProperty("in_progress")
    private List<MatchResult> inProgress;

    @JsonProperty("registered")
    private List<MatchResult> registered;
}
