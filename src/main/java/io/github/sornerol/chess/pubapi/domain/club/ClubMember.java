package io.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ClubMember {
    @JsonProperty("username")
    private String username;

    @JsonProperty("joined")
    private Long joined;
}
