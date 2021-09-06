package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Statistical details about a player
 */
@Getter
@Setter
@ToString
public class PlayerStats {
    /**
     * Player's self-reported over-the-board rating
     */
    @JsonProperty("fide")
    private Integer fide;

    /**
     * Statistics for daily chess games
     */
    @JsonProperty("chess_daily")
    private RatingPoolStats chessDaily;

    /**
     * Statistics for daily chess960 games
     */
    @JsonProperty("chess960_daily")
    private RatingPoolStats chess960Daily;

    /**
     * Statistics for live rapid games
     */
    @JsonProperty("chess_rapid")
    private RatingPoolStats chessRapid;

    /**
     * Statistics for live bullet games
     */
    @JsonProperty("chess_bullet")
    private RatingPoolStats chessBullet;

    /**
     * Statistics for live blitz games
     */
    @JsonProperty("chess_blitz")
    private RatingPoolStats chessBlitz;

    /**
     * Statistics for tactics
     */
    @JsonProperty("tactics")
    private LearningStats tactics;

    /**
     * Statistics for lessons
     */
    @JsonProperty("lessons")
    private LearningStats lessons;

    /**
     * Statistics for puzzle rush
     */
    @JsonProperty("puzzle_rush")
    private PuzzleRushStats puzzleRush;
}
