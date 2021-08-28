package io.github.sornerol.chess.pubapi.domain.player.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PlayerDetail {
    @JsonProperty("rating")
    @Getter @Setter private Integer rating;

    @JsonProperty("result")
    @Getter @Setter private String result;

    @JsonProperty("@id")
    @Getter @Setter private String id;

    @JsonProperty("username")
    @Getter @Setter private String username;
}
