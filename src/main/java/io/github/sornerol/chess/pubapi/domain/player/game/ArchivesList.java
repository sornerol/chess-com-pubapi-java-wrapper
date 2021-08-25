package io.github.sornerol.chess.pubapi.domain.player.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ArchivesList {
    @JsonProperty("archives")
    @Getter
    @Setter
    private List<String> archives;
}
