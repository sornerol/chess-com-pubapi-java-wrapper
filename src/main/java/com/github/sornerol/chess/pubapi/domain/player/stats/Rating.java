package com.github.sornerol.chess.pubapi.domain.player.stats;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Rating details for a player statistic
 */
@Getter
@Setter
@ToString
public class Rating {
    /**
     * Player's rating
     */
    @JsonProperty("rating")
    private Integer rating;

    /**
     * Timestamp for this rating as epoch time (seconds)
     */
    @JsonProperty("date")
    private Long date;

    /**
     * Player's rating deviation
     */
    @JsonProperty("rd")
    private Integer rd;

    /**
     * Link to game on www.chess.com that this rating was achieved
     */
    @JsonProperty("game")
    private String gameUrl;
}
