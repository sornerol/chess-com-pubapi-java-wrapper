package com.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class Accuracies {
    @JsonProperty("white")
    private BigDecimal white;

    @JsonProperty("black")
    private BigDecimal black;
}
