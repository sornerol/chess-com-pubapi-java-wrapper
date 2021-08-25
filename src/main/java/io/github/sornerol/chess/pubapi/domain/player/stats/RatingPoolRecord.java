package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import java.math.BigDecimal;

@ToString
public class RatingPoolRecord {
    @JsonProperty("win")
    @Getter @Setter private Integer win;

    @JsonProperty("loss")
    @Getter @Setter private Integer loss;

    @JsonProperty("draw")
    @Getter @Setter private Integer draw;

    @JsonProperty("time_per_move")
    @Getter @Setter private Integer timePerMove;

    @JsonProperty("timeout_percent")
    @Getter @Setter private BigDecimal timeoutPercent;
}
