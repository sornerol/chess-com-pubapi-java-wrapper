package io.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.Rules;
import io.github.sornerol.chess.pubapi.domain.game.enums.TimeClass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Base game class that contains fields common to both in-progress daily games and archive games.
 */
@Getter
@Setter
@ToString
public abstract class GameBase {
    /**
     * Link to game on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * FEN string for the game's current or ending position
     */
    @JsonProperty("fen")
    private String fen;

    /**
     * PGN representation of the game
     */
    @JsonProperty("pgn")
    private String pgn;

    /**
     * Game's PGN-compliant time control.
     */
    @JsonProperty("time_control")
    private String timeControl;

    /**
     * Game's time class
     */
    @JsonProperty("time_class")
    private TimeClass timeClass;

    /**
     * Is the game rated?
     */
    @JsonProperty("rated")
    private Boolean rated;

    /**
     * Game's start timestamp as epoch time (seconds)
     */
    @JsonProperty("start_time")
    private Long startTime;

    /**
     * Game's chess variant
     */
    @JsonProperty("rules")
    private Rules rules;

    /**
     * PubAPI URL of the tournament if the game was a tournament game
     */
    @JsonProperty("tournament")
    private String tournamentApiUrl;

    /**
     * PubAPI URL of the match if the game was a team match game
     */
    @JsonProperty("match")
    private String matchApiUrl;
}
