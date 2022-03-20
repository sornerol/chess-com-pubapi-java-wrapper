package io.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for player's team match participation history
 */
@Getter
@Setter
@ToString
public class MatchHistory {
    /**
     * Finished team matches
     */
    @JsonProperty("finished")
    private List<MatchResult> finished;

    /**
     * Team matches in progress
     */
    @JsonProperty("in_progress")
    private List<MatchResult> inProgress;

    /**
     * Team matches player is registered for
     */
    @JsonProperty("registered")
    private List<MatchResult> registered;
}
