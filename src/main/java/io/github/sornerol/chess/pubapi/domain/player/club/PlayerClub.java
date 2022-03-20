package io.github.sornerol.chess.pubapi.domain.player.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Information about a club that a player has joined
 */
@Getter
@Setter
@ToString
public class PlayerClub {
    /**
     * Link to the club's PubAPI profile
     */
    @JsonProperty("@id")
    private String clubApiUrl;

    /**
     * Club's name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Club's last activity timestamp as epoch time (seconds)
     */
    @JsonProperty("last_activity")
    private Long lastActivity;

    /**
     * Link to club's icon
     */
    @JsonProperty("icon")
    private String iconUrl;

    /**
     * Link to web page on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Timestamp when player joined club as epoch time (seconds)
     */
    @JsonProperty("joined")
    private Long joined;
}
