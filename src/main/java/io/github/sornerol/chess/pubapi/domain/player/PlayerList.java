package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class PlayerList {
    @JsonProperty("players")
    @Getter @Setter private List<String> players;
}
