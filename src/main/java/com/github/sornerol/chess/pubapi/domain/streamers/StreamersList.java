package com.github.sornerol.chess.pubapi.domain.streamers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for the list of streamers returned by the get streamers call.
 */
@ToString
@Getter
@Setter
public class StreamersList {
    /**
     * @param streamers A list of Chess.com streamers.
     * @return A list of Chess.com streamers.
     */
    @JsonProperty("streamers")
    private List<Streamer> streamers;
}
