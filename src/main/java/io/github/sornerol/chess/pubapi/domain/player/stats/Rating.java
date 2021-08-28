package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Rating {
    @JsonProperty("rating")
    private Integer score;

    @JsonProperty("date")
    private Long date;

    @JsonProperty("rd")
    private Integer rd;

    @JsonProperty("game")
    private String gameUrl;
}
