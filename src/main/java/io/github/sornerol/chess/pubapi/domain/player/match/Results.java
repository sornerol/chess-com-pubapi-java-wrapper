package io.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Results {
    @JsonProperty("played_as_white")
    private String playedAsWhite;

    @JsonProperty("played_as_black")
    private String playedAsBlack;
}
