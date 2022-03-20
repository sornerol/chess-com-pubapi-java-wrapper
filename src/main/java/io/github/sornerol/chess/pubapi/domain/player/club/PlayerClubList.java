package io.github.sornerol.chess.pubapi.domain.player.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for retrieving a player's joined club list
 */
@Getter
@Setter
@ToString
public class PlayerClubList {
    /**
     * List of clubs for a player
     */
    @JsonProperty("clubs")
    private List<PlayerClub> clubs;
}
