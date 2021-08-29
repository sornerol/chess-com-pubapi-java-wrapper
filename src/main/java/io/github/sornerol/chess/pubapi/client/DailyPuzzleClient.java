package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.puzzle.DailyPuzzle;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class DailyPuzzleClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/puzzle";

    public DailyPuzzle loadTodaysDailyPuzzle() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, DailyPuzzle.class);
    }

    public DailyPuzzle loadRandomDailyPuzzle() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE + "/random", DailyPuzzle.class);
    }
}
