package io.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class PlayerStats {
    @JsonProperty("fide")
    @Getter @Setter private Long fide;

    @JsonProperty("chess_daily")
    @Getter @Setter private RatingPoolStats chessDaily;

    @JsonProperty("chess960_daily")
    @Getter @Setter private RatingPoolStats chess960Daily;

    @JsonProperty("chess_rapid")
    @Getter @Setter private RatingPoolStats chessRapid;

    @JsonProperty("chess_bullet")
    @Getter @Setter private RatingPoolStats chessBullet;

    @JsonProperty("chess_blitz")
    @Getter @Setter private RatingPoolStats chessBlitz;

    @JsonProperty("tactics")
    @Getter @Setter private LearningStats tactics;

    @JsonProperty("lessons")
    @Getter @Setter private LearningStats lessons;

    @JsonProperty("puzzle_rush")
    @Getter @Setter private PuzzleRushStats puzzleRush;
}
