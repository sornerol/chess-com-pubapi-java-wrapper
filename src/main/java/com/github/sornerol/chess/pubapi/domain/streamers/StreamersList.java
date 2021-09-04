package com.github.sornerol.chess.pubapi.domain.streamers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class StreamersList {
    @JsonProperty("streamers")
    private List<Streamer> streamers;
}
