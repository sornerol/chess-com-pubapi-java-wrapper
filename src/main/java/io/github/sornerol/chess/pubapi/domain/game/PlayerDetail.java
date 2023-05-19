package io.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.enums.GameResult;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

/**
 * Details about a player of an {@link ArchiveGame}
 */
@Getter
@Setter
@ToString
public class PlayerDetail {
    /**
     * Player's rating
     */
    @JsonProperty("rating")
    private Integer rating;

    /**
     * Player's game result
     */
    @JsonProperty("result")
    private GameResult result;

    /**
     * Link to player's PubAPI profile
     */
    @JsonProperty("@id")
    private String playerApiUrl;

    /**
     * Player's username
     */
    @JsonProperty("username")
    private String username;
    
    /**
     * The uuid of the player
     */
    @JsonProperty("uuid")
    private UUID uuid;
}
