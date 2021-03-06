package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.club.ClubList;
import io.github.sornerol.chess.pubapi.domain.country.Country;
import io.github.sornerol.chess.pubapi.domain.player.PlayerList;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;
import java.util.List;

/**
 * Client for fetching data related to the countries recognized by the Chess.com platform.
 *
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country">Chess.com PubAPI documentation</a>
 */
public class CountryClient extends PubApiClientBase {
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/country";

    /**
     * Fetch country information from a country PubAPI URL.
     *
     * @param url Chess.com PubAPI URL to country
     * @return {@link Country} returned by Chess.com.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country-profile">Chess.com PubAPI documentation</a>
     */
    public Country getCountryFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid country URL");
        }
        return getRequest(url, Country.class);
    }

    /**
     * Fetch country information for an ISO code.
     *
     * @param isoCode The 2-character <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO</a> code for the country.
     *                See <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country">Chess.com's API documentation</a>
     *                for a list of additional "user-assigned codes" recognized by Chess.com.
     * @return {@link Country} returned by Chess.com.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country-profile">Chess.com PubAPI documentation</a>
     */
    public Country getCountryByIsoCode(String isoCode) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, isoCode);
        return getRequest(endpoint, Country.class);
    }

    /**
     * Fetch a list of newly-registered and active players from a country.
     *
     * @param isoCode The 2-character <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO</a> code for the country.
     *                See <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country">Chess.com's API documentation</a>
     *                for a list of additional "user-assigned codes" recognized by Chess.com.
     * @return A list of Chess.com usernames.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country-players">Chess.com PubAPI documentation</a>
     */
    public List<String> getNewAndActivePlayersForCountry(String isoCode) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/players", ENDPOINT_BASE, isoCode);
        return getRequest(endpoint, PlayerList.class).getPlayers();
    }

    /**
     * Fetch a list clubs identified as being in or associated with a country.
     *
     * @param isoCode The 2-character <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO</a> code for the country.
     *                See <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country">Chess.com's API documentation</a>
     *                for a list of additional "user-assigned codes" recognized by Chess.com.
     * @return A list of club PubAPI URLs.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-country-clubs">Chess.com PubAPI documentation</a>
     */
    public List<String> geClubApiUrlsForCountry(String isoCode) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/clubs", ENDPOINT_BASE, isoCode);
        return getRequest(endpoint, ClubList.class).getClubsApiUrls();
    }
}
