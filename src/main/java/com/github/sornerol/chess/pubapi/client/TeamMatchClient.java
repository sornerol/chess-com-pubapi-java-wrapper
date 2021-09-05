package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.match.TeamMatch;
import com.github.sornerol.chess.pubapi.domain.match.TeamMatchBoard;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class TeamMatchClient extends PubApiClientBase {
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/match";

    public TeamMatch getTeamMatchFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid team match API URL");
        }
        return getRequest(url, TeamMatch.class);
    }

    public TeamMatch getDailyTeamMatchById(Integer id) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%d", ENDPOINT_BASE, id);
        return getRequest(endpoint, TeamMatch.class);
    }

    public TeamMatch getLiveTeamMatchById(Integer id) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/live/%d", ENDPOINT_BASE, id);
        return getRequest(endpoint, TeamMatch.class);
    }

    public TeamMatchBoard getTeamMatchBoardFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid team match board API URL");
        }
        return getRequest(url, TeamMatchBoard.class);
    }

    public TeamMatchBoard getDailyTeamMatchBoard(Integer teamMatchId, Integer boardId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%d/%d", ENDPOINT_BASE, teamMatchId, boardId);
        return getRequest(endpoint, TeamMatchBoard.class);
    }

    public TeamMatchBoard getLiveTeamMatchBoard(Integer teamMatchId, Integer boardId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/live/%d/%d", ENDPOINT_BASE, teamMatchId, boardId);
        return getRequest(endpoint, TeamMatchBoard.class);
    }
}
