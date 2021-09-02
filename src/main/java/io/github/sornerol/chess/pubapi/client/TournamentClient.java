package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.tournament.Tournament;
import io.github.sornerol.chess.pubapi.domain.tournament.TournamentGroup;
import io.github.sornerol.chess.pubapi.domain.tournament.TournamentRound;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class TournamentClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/tournament";

    public Tournament getTournamentFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid tournament API URL");
        }
        return getRequest(url, Tournament.class);
    }

    public Tournament getTournamentByUrlId(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, Tournament.class);
    }

    public TournamentRound getTournamentRound(String urlId, Integer round) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/%d", ENDPOINT_BASE, urlId, round);
        return getRequest(endpoint, TournamentRound.class);
    }

    public TournamentRound getTournamentRoundByApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid tournament API URL");
        }
        return getRequest(url, TournamentRound.class);
    }

    public TournamentGroup getTournamentGroup(String urlId, Integer round, Integer group) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/%d/%d", ENDPOINT_BASE, urlId, round, group);
        return getRequest(endpoint, TournamentGroup.class);
    }

    public TournamentGroup getTournamentGroupByApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid tournament API URL");
        }
        return getRequest(url, TournamentGroup.class);
    }
}
