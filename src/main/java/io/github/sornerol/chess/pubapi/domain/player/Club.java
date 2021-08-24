package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Club {
    @JsonProperty("@id")
    @Getter @Setter private String id;

    @JsonProperty("name")
    @Getter @Setter private String name;

    @JsonProperty("last_activity")
    @Getter @Setter private Long lastActivity;

    @JsonProperty("icon")
    @Getter @Setter private String iconUrl;

    @JsonProperty("url")
    @Getter @Setter private String url;

    @JsonProperty("joined")
    @Getter @Setter private Long joined;
}
