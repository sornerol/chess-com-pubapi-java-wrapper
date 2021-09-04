package com.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class TournamentRound {
    @JsonProperty("groups")
    private List<String> groupsApiUrls;

    @JsonProperty("players")
    private List<TournamentPlayer> players;
}
