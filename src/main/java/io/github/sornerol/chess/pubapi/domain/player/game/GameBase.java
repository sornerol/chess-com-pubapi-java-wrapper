package io.github.sornerol.chess.pubapi.domain.player.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class GameBase {

    @JsonProperty("url")
    private String url;

    @JsonProperty("fen")
    private String fen;

    @JsonProperty("pgn")
    private String pgn;

    @JsonProperty("time_control")
    private String timeControl;

    @JsonProperty("time_class")
    private String timeClass;

    @JsonProperty("rated")
    private Boolean rated;

    @JsonProperty("start_time")
    private Long startTime;

    @JsonProperty("rules")
    private String rules;

    @JsonProperty("tournament")
    private String tournamentApiUrl;

    @JsonProperty("match")
    private String matchApiUrl;
}
