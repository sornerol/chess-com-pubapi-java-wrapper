package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for getting a player's online status
 */
@Getter
@Setter
@ToString
public class PlayerOnline {
    /**
     * Whether the player has been online in the last five minutes
     */
    @JsonProperty("online")
    private Boolean online;
}
