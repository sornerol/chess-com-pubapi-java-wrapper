package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class RatingPoolRecord {
    @JsonProperty("win")
    private Integer win;

    @JsonProperty("loss")
    private Integer loss;

    @JsonProperty("draw")
    private Integer draw;

    @JsonProperty("time_per_move")
    private Integer timePerMove;

    @JsonProperty("timeout_percent")
    private BigDecimal timeoutPercent;
}
