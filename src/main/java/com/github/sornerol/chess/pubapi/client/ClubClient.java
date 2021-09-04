package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.club.match.ClubMatches;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;
import com.github.sornerol.chess.pubapi.domain.club.Club;
import com.github.sornerol.chess.pubapi.domain.club.ClubMembers;

import java.io.IOException;

/**
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-club">Chess.com PubAPI documentation</a>
 */
public class ClubClient extends PubApiClientBase {

    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/club";

    /**Fetch club details from a club PubAPI URL.
     *
     * @param url Chess.com PubAPI URL to club.
     * @return {@link Club} returned by Chess.com.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-club-profile">Chess.com PubAPI documentation</a>
     */
    public Club getClubFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid club API URL");
        }
        return getRequest(url, Club.class);
    }

    /**Fetch club details by the club's URL ID.
     *
     * @param urlId The club's URL id. This is the same as found in the club's web page URL on www.chess.com.
     * @return {@link Club} returned by Chess.com.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-club-profile">Chess.com PubAPI documentation</a>
     */
    public Club getClubByUrlId(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, Club.class);
    }

    /**Fetch list of club members, grouped by club activity frequency.
     *
     * @param urlId The club's URL id. This is the same as found in the club's web page URL on www.chess.com.
     * @return {@link ClubMembers} returned by Chess.com.
     * @throws IOException if there is a problem connecting to Chess.com
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-club-members">Chess.com PubAPI documentation</a>
     */
    public ClubMembers getClubMembers(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/members", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, ClubMembers.class);
    }

    /**Fetch list of club matches grouped by status.
     *
     * @param urlId The club's URL id. This is the same as found in the club's web page URL on www.chess.com.
     * @return {@link ClubMatches} returned by Chess.com
     * @throws IOException if there is a problem connecting to Chess.com
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-club-matches">Chess.com PubAPI documentation</a>
     */
    public ClubMatches getClubMatches(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/matches", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, ClubMatches.class);
    }
}
