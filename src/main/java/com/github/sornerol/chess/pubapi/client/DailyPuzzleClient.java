package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.puzzle.DailyPuzzle;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

/**
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-daily-puzzle">Chess.com PubAPI documentation</a>
 */
public class DailyPuzzleClient extends PubApiClientBase {

    /**
     * The base URL of the endpoint queried by requests from this client (https://api.chess.com/pub/puzzle).
     */
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/puzzle";

    /**Fetch today's daily puzzle
     *
     * @return Today's {@link DailyPuzzle}.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-daily-puzzle">Chess.com PubAPI documentation</a>
     */
    public DailyPuzzle getTodaysDailyPuzzle() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, DailyPuzzle.class);
    }

    /**Fetch a random daily puzzle. Note that, according to Chess.com's API documentation, this endpoint has around 15 seconds
     * of caching latency.
     *
     * @return A random {@link DailyPuzzle}.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-random-daily-puzzle">Chess.com PubAPI documentation</a>
     */
    public DailyPuzzle getRandomDailyPuzzle() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE + "/random", DailyPuzzle.class);
    }
}
