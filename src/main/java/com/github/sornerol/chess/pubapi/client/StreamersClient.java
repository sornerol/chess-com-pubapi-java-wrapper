package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.streamers.StreamersList;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

/**
 * Client for fetching data about streamers.
 *
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-streamers">Chess.com PubAPI documentation</a>
 */
public class StreamersClient extends PubApiClientBase {

    /**
     * The base URL of the endpoint queried by requests from this client (https://api.chess.com/pub/streamers).
     */
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/streamers";

    /**
     * Fetch information about Twitch streamers on Chess.com.
     *
     * @return {@link StreamersList} with information about streamers.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-streamers">Chess.com PubAPI documentation</a>
     */
    public StreamersList getStreamers() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, StreamersList.class);
    }
}
