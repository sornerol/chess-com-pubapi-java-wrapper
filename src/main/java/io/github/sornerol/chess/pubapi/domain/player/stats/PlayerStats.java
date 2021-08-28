package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PlayerStats {
    @JsonProperty("fide")
    private Long fide;

    @JsonProperty("chess_daily")
    private RatingPoolStats chessDaily;

    @JsonProperty("chess960_daily")
    private RatingPoolStats chess960Daily;

    @JsonProperty("chess_rapid")
    private RatingPoolStats chessRapid;

    @JsonProperty("chess_bullet")
    private RatingPoolStats chessBullet;

    @JsonProperty("chess_blitz")
    private RatingPoolStats chessBlitz;

    @JsonProperty("tactics")
    private LearningStats tactics;

    @JsonProperty("lessons")
    private LearningStats lessons;

    @JsonProperty("puzzle_rush")
    private PuzzleRushStats puzzleRush;
}
