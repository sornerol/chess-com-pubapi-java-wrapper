package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Details about a tournament round
 */
@Getter
@Setter
@ToString
public class TournamentRound {
    /**
     * List of PubAPI URLs for player groupings
     */
    @JsonProperty("groups")
    private List<String> groupsApiUrls;

    /**
     * List of players in the tournament round
     */
    @JsonProperty("players")
    private List<TournamentPlayer> players;
}
