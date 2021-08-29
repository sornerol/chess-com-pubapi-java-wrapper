package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.streamers.StreamersList;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class StreamersClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/streamers";

    public StreamersList getStreamers() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, StreamersList.class);
    }
}
