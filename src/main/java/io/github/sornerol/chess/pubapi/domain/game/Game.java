package io.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Game extends GameBase {
    @JsonProperty("move_by")
    private Long moveBy;

    @JsonProperty("last_activity")
    private Long lastActivity;

    @JsonProperty("turn")
    private String turn;

    @JsonProperty("white")
    private String whiteApiUrl;

    @JsonProperty("black")
    private String blackApiUrl;

    @JsonProperty("draw_offer")
    private String drawOffer;
}
