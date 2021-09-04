package com.github.sornerol.chess.pubapi.domain.player.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class TournamentHistory {
    @JsonProperty("finished")
    List<TournamentResult> finished;

    @JsonProperty("in_progress")
    List<TournamentResult> inProgress;

    @JsonProperty("registered")
    List<TournamentResult> registered;
}
