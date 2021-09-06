package com.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Contains information about a club member
 */
@Getter
@Setter
@ToString
public class ClubMember {
    /**
     * Player's Chess.com username
     */
    @JsonProperty("username")
    private String username;

    /**
     * Timestamp for when the player joined the club as epoch time (seconds)
     */
    @JsonProperty("joined")
    private Long joined;
}
