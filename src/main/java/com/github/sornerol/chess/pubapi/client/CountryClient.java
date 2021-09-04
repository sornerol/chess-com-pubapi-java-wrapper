package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.club.ClubList;
import com.github.sornerol.chess.pubapi.domain.country.Country;
import com.github.sornerol.chess.pubapi.domain.player.PlayerList;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;
import java.util.List;

/**
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country">Chess.com PubAPI documentation</a>
 */
public class CountryClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/country";

    /**Fetch country information from a country PubAPI URL.
     *
     * @param url Chess.com PubAPI URL to country
     * @return {@link Country} returned by Chess.com.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country-profile">Chess.com PubAPI documentation</a>
     */
    public Country getCountryFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid country URL");
        }
        return getRequest(url, Country.class);
    }

    /**Fetch country information for an ISO code.
     *
     * @param isoCode The 2-character <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO</a> code for the country.
     *                See <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country">Chess.com's API documentation</a>
     *                for a list of additional "user-assigned codes" recognized by Chess.com.
     * @return {@link Country} returned by Chess.com.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country-profile">Chess.com PubAPI documentation</a>
     */
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
