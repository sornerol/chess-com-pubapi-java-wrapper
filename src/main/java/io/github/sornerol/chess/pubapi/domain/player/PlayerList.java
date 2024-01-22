package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for getting a list of player usernames
 */
@Getter
@Setter
@ToString
public class PlayerList {
    /**
     * List of player usernames
     */
    @JsonProperty("players")
    private List<String> players;

    /**
     * Comment about the result set. This is used when Chess.com is not providing a full
     * result list due to performance or other reasons.
     */
    @JsonProperty("comment")
    private String comment;
}
