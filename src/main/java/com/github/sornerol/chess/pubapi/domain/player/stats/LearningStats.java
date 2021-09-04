package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LearningStats {
    @JsonProperty("highest")
    private Rating highest;

    @JsonProperty("lowest")
    private Rating lowest;
}