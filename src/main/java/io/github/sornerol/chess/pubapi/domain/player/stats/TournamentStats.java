package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class TournamentStats {
    @JsonProperty("points")
    @Getter @Setter private Integer points;

    @JsonProperty("withdraw")
    @Getter @Setter private Integer withdraw;

    @JsonProperty("count")
    @Getter @Setter private Integer count;

    @JsonProperty("highest_finish")
    @Getter @Setter private Integer highestFinish;
}
