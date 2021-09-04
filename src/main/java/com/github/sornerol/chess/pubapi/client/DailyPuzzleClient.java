package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.puzzle.DailyPuzzle;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class DailyPuzzleClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/puzzle";

    public DailyPuzzle getTodaysDailyPuzzle() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, DailyPuzzle.class);
    }

    public DailyPuzzle getRandomDailyPuzzle() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE + "/random", DailyPuzzle.class);
    }
}
