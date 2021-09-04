package io.github.sornerol.chess.pubapi.domain.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.game.ArchiveGame;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class TournamentGroup {
    @JsonProperty("fair_play_removals")
    private List<String> fairPlayRemovals;

    @JsonProperty("games")
    private List<ArchiveGame> games;

    @JsonProperty("players")
    private List<TournamentPlayer> players;
}

