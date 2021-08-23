package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class PlayerOnline {
    @JsonProperty("online")
    @Getter @Setter private Boolean online;
}
