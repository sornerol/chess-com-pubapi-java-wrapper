package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class LearningStats {
    @JsonProperty("highest")
    @Getter @Setter private Rating highest;

    @JsonProperty("lowest")
    @Getter @Setter private Rating lowest;
}
