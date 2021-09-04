package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RatingPoolStats {
    @JsonProperty("last")
    private Rating last;

    @JsonProperty("best")
    private Rating best;

    @JsonProperty("record")
    private RatingPoolRecord record;

    @JsonProperty("tournament")
    private TournamentStats tournament;
}
