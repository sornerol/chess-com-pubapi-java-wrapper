package io.github.sornerol.chess.pubapi.domain.player.tournament;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.player.enums.PlayerTournamentStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TournamentResult {
    @JsonProperty("url")
    private String url;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("wins")
    private Integer wins;

    @JsonProperty("losses")
    private Integer losses;

    @JsonProperty("draws")
    private Integer draws;

    @JsonProperty("points_awarded")
    private Integer pointsAwarded;

    @JsonProperty("placement")
    private Integer placement;

    @JsonProperty("status")
    private PlayerTournamentStatus status;

    @JsonProperty("total_players")
    private Integer totalPlayers;

    @JsonProperty("time_class")
    private String timeClass;

    @JsonProperty("type")
    private String type;
}
