package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.leaderboards.Leaderboards;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class LeaderboardsClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/leaderboards";

    public Leaderboards getLeaderboards() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, Leaderboards.class);
    }
}
