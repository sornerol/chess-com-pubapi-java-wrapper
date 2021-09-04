package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.match.TeamMatch;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class TeamMatchClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/match";

    public TeamMatch getTeamMatchFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid team match API URL");
        }
        return getRequest(url, TeamMatch.class);
    }

    public TeamMatch getDailyTeamMatchByUrlId(Integer urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%d", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, TeamMatch.class);
    }

    public TeamMatch getLiveTeamMatchByUrlId(Integer urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/live/%d", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, TeamMatch.class);
    }

}
