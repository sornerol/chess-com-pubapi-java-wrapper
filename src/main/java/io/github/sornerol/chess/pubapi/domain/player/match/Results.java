package io.github.sornerol.chess.pubapi.domain.player.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.GameResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Results {
    @JsonProperty("played_as_white")
    private GameResult playedAsWhite;

    @JsonProperty("played_as_black")
    private GameResult playedAsBlack;
}
