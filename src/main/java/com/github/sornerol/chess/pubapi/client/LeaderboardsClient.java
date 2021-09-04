package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.leaderboards.Leaderboards;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

/**Client for fetching Chess.com leaderboards.
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-leaderboards">Chess.com PubAPI documentation</a>
 */
public class LeaderboardsClient extends PubApiClientBase {

    /**
     * The base URL of the endpoint queried by requests from this client (https://api.chess.com/pub/leaderboards).
     */
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/leaderboards";

    /**Fetch information on the top 50 players for daily and live games, tactics, and lessons.
     *
     * @return {@link Leaderboards} for daily and live games, tactics, and lessons.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     */
    public Leaderboards getLeaderboards() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, Leaderboards.class);
    }
}
