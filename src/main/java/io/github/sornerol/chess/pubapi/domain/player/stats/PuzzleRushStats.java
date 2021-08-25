package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PuzzleRushStats {
    @JsonProperty("best")
    @Getter @Setter private PuzzleRushStatistic best;
}
