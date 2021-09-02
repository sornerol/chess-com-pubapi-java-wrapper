package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.club.Club;
import io.github.sornerol.chess.pubapi.domain.club.ClubMembers;
import io.github.sornerol.chess.pubapi.domain.club.match.ClubMatches;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class ClubClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/club";

    public Club getClubFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid club API URL");
        }
        return getRequest(url, Club.class);
    }

    public Club getClubByUrlId(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, Club.class);
    }

    public ClubMembers getClubMembers(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/members", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, ClubMembers.class);
    }

    public ClubMatches getClubMatches(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/matches", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, ClubMatches.class);
    }
}
