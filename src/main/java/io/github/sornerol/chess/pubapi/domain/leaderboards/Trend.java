package io.github.sornerol.chess.pubapi.domain.leaderboards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Trend {
    @JsonProperty("direction")
    private Integer direction;

    @JsonProperty("delta")
    private Integer delta;
}
