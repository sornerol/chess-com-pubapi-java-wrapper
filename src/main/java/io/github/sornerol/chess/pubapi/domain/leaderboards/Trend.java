package io.github.sornerol.chess.pubapi.domain.leaderboards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Contains information about the player's leaderboard position trend
 */
@ToString
@Getter
@Setter
public class Trend {
    /**
     * The player's trend direction
     * (TODO: There doesn't appear to be any documentation as to what the value of this field actually means).
     */
    @JsonProperty("direction")
    private Integer direction;

    /**
     * The player's change in leaderboard position
     */
    @JsonProperty("delta")
    private Integer delta;
}
