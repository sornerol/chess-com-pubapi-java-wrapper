package com.github.sornerol.chess.pubapi.domain.puzzle;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Information for a daily puzzle
 */
@Getter
@Setter
@ToString
public class DailyPuzzle {
    /**
     * The puzzle's display title
     */
    @JsonProperty("title")
    private String title;

    /**
     * Puzzle comments
     */
    @JsonProperty("comments")
    private String comments;

    /**
     * Link to the puzzle on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * The published timestamp in epoch time (seconds)
     */
    @JsonProperty("publish_time")
    private Long publishTime;

    /**
     * The FEN string for the puzzle's starting position
     */
    @JsonProperty("fen")
    private String fen;

    /**
     * The puzzle's solution in PGN format
     */
    @JsonProperty("pgn")
    private String pgn;

    /**
     * Link to the puzzles image
     */
    @JsonProperty("image")
    private String imageUrl;
}
