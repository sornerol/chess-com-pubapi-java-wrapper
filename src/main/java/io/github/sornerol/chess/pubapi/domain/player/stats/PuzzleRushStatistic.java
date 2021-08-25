package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PuzzleRushStatistic {
    @JsonProperty("total_attempts")
    @Getter @Setter private Integer totalAttempts;

    @JsonProperty("score")
    @Getter @Setter private Integer score;
}
