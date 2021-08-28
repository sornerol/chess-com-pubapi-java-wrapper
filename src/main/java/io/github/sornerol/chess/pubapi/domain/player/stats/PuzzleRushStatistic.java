package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PuzzleRushStatistic {
    @JsonProperty("total_attempts")
    private Integer totalAttempts;

    @JsonProperty("score")
    private Integer score;
}
