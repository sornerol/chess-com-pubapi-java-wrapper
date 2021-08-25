package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class RatingPoolStats {
    @JsonProperty("last")
    @Getter @Setter private Rating last;

    @JsonProperty("best")
    @Getter @Setter private Rating best;

    @JsonProperty("record")
    @Getter @Setter private RatingPoolRecord record;

    @JsonProperty("tournament")
    @Getter @Setter private TournamentStats tournament;
}
