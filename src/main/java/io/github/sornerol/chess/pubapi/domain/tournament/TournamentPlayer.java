package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
public class TournamentPlayer {
    @JsonProperty("username")
    private String username;

    @JsonProperty("status")
    private String status;

    @JsonProperty("is_advancing")
    private Boolean isAdvancing;

    @JsonProperty("points")
    private BigDecimal points;

    @JsonProperty("tie_break")
    private BigDecimal tiebreak;
}
