package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TournamentStats {
    @JsonProperty("points")
    private Integer points;

    @JsonProperty("withdraw")
    private Integer withdraw;

    @JsonProperty("count")
    private Integer count;

    @JsonProperty("highest_finish")
    private Integer highestFinish;
}
