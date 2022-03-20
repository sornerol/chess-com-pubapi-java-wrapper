package io.github.sornerol.chess.pubapi.domain.match;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.GameResult;
import io.github.sornerol.chess.pubapi.domain.player.enums.MembershipStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * Details about a team player in a match
 */
@Getter
@Setter
@ToString
public class TeamMatchPlayer {
    /**
     * Player's Chess.com username
     */
    @JsonProperty("username")
    private String username;

    /**
     * PubAPI link to the player's statistics
     */
    @JsonProperty("stats")
    private String playerStatsApiUrl;

    /**
     * Player's rating
     */
    @JsonProperty("rating")
    private Integer rating;

    /**
     * Player's timeout percentage
     */
    @JsonProperty("timeout_percent")
    private BigDecimal timeoutPercent;

    /**
     * Player's rating deviation
     */
    @JsonProperty("rd")
    private BigDecimal rd;

    /**
     * Player's Chess.com membership status
     */
    @JsonProperty("status")
    private MembershipStatus membershipStatus;

    /**
     * Player's game result as black
     */
    @JsonProperty("played_as_black")
    private GameResult playedAsBlack;

    /**
     * Player's game result as white
     */
    @JsonProperty("played_as_white")
    private GameResult playedAsWhite;

    /**
     * PubAPI link to the player's board in the match
     */
    @JsonProperty("board")
    private String boardApiUrl;
}
