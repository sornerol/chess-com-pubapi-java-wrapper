package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.leaderboards.Leaderboards;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class LeaderboardsClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/leaderboards";

    public Leaderboards loadLeaderboards() throws IOException, ChessComPubApiException {
        return getRequest(ENDPOINT_BASE, Leaderboards.class);
    }
}
