package io.github.sornerol.chess.pubapi.domain.player.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Game {
    @JsonProperty("url")
    @Getter @Setter private String url;

    @JsonProperty("move_by")
    @Getter @Setter private Long moveBy;

    @JsonProperty("pgn")
    @Getter @Setter private String pgn;

    @JsonProperty("time_control")
    @Getter @Setter private String timeControl;

    @JsonProperty("last_activity")
    @Getter @Setter private Long lastActivity;

    @JsonProperty("rated")
    @Getter @Setter private Boolean rated;

    @JsonProperty("turn")
    @Getter @Setter private String turn;

    @JsonProperty("fen")
    @Getter @Setter private String fen;

    @JsonProperty("start_time")
    @Getter @Setter private Long startTime;

    @JsonProperty("time_class")
    @Getter @Setter private String timeClass;

    @JsonProperty("rules")
    @Getter @Setter private String rules;

    @JsonProperty("white")
    @Getter @Setter private String whiteApiUrl;

    @JsonProperty("black")
    @Getter @Setter private String blackApiUrl;

    @JsonProperty("draw_offer")
    @Getter @Setter private String drawOffer;

    @JsonProperty("tournament")
    @Getter @Setter private String tournament;

    @JsonProperty("match")
    @Getter @Setter private String match;
}
