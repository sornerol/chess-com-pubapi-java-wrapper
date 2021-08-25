package io.github.sornerol.chess.pubapi.domain.player.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
public class ClubList {
    @JsonProperty("clubs")
    @Getter @Setter private List<Club> clubs;
}
