package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Rating {
    @JsonProperty("rating")
    @Getter @Setter private Integer score;

    @JsonProperty("date")
    @Getter @Setter private Long date;

    @JsonProperty("rd")
    @Getter @Setter private Integer rd;

    @JsonProperty("game")
    @Getter @Setter private String gameUrl;
}
