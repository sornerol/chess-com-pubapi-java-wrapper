package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.tournament.enums.TournamentStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Tournament {

    @JsonProperty("name")
    private String name;

    @JsonProperty("url")
    private String url;

    @JsonProperty("description")
    private String description;

    @JsonProperty("creator")
    private String creatorUsername;

    @JsonProperty("status")
    private TournamentStatus status;

    @JsonProperty("finish_time")
    private Long finishTime;

    @JsonProperty("settings")
    private TournamentSettings settings;

    @JsonProperty("players")
    private List<TournamentPlayer> players;

    @JsonProperty("rounds")
    private List<String> roundsApiUrls;
}
