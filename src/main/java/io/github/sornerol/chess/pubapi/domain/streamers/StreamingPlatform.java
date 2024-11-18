package io.github.sornerol.chess.pubapi.domain.streamers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Contains details about a streaming platform a {@link io.github.sornerol.chess.pubapi.domain.player.Player}
 * or {@link Streamer} belongs to.
 */
@ToString
@Getter
@Setter
public class StreamingPlatform {
    /**
     * The streaming platform name, such as Twitch or YouTube.
     */
    @JsonProperty("type")
    private String platformType;

    /**
     * If the streamer is currently live, this field is set to the URL for the streamer's live stream.
     */
    @JsonProperty("stream_url")
    private String streamUrl;

    /**
     * URL to the streamer's channel page on the streaming platform.
     */
    @JsonProperty("channel_url")
    private String channelUrl;

    /**
     * Is the streamer live on this streaming platform?
     */
    @JsonProperty("is_live")
    private Boolean isLive;

    /**
     * Is this platform the streamer's main live platform?
     */
    @JsonProperty("is_main_live_platform")
    private Boolean isMainLivePlatform;
}
