package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.club.ClubList;
import io.github.sornerol.chess.pubapi.domain.country.Country;
import io.github.sornerol.chess.pubapi.domain.player.PlayerList;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;
import java.util.List;

public class CountryClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/country";

    public Country getCountryFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid country URL");
        }
        return getRequest(url, Country.class);
    }

    public Country getCountryByIsoCode(String isoCode) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, isoCode);
        return getRequest(endpoint, Country.class);
    }

    public List<String> getNewPlayersFromCountry(String isoCode) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/players", ENDPOINT_BASE, isoCode);
        return getRequest(endpoint, PlayerList.class).getPlayers();
    }

    public List<String> geClubApiUrlsForCountry(String isoCode) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/clubs", ENDPOINT_BASE, isoCode);
        return getRequest(endpoint, ClubList.class).getClubsApiUrls();
    }
}
