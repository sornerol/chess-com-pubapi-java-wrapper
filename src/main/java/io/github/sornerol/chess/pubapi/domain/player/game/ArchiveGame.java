package io.github.sornerol.chess.pubapi.domain.player.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ArchiveGame extends GameBase {
    @JsonProperty("white")
    private PlayerDetail white;

    @JsonProperty("black")
    private PlayerDetail black;

    @JsonProperty("end_time")
    private Long endTime;

    @JsonProperty("eco")
    private String ecoApiUrl;

    @JsonProperty("accuracies")
    private Accuracies accuracies;
}
