package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.tournament.enums.TournamentStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Details about a Chess.com tournament.
 */
@Getter
@Setter
@ToString
public class Tournament {
    /**
     * Tournament name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Tournament web page URL on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Tournament description
     */
    @JsonProperty("description")
    private String description;

    /**
     * Username of the tournament's creator
     */
    @JsonProperty("creator")
    private String creatorUsername;

    /**
     * Tournament's status
     */
    @JsonProperty("status")
    private TournamentStatus status;

    /**
     * Tournament finish timestamp as epoch time (seconds)
     */
    @JsonProperty("finish_time")
    private Long finishTime;

    /**
     * Tournament configuration
     */
    @JsonProperty("settings")
    private TournamentSettings settings;

    /**
     * List of tournament players
     */
    @JsonProperty("players")
    private List<TournamentPlayer> players;

    /**
     * List of PubAPI URLs to the tournament's round details
     */
    @JsonProperty("rounds")
    private List<String> roundsApiUrls;
}
