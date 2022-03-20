package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.match.TeamMatch;
import io.github.sornerol.chess.pubapi.domain.match.TeamMatchBoard;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

/**
 * Client for fetching data related to team matches.
 *
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-matches">Chess.com PubAPI documentation</a>
 */
public class TeamMatchClient extends PubApiClientBase {
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/match";

    /**
     * Fetch a daily or live team match by its PubAPI URL.
     *
     * @param url Chess.com PubAPI URL for the team match.
     * @return {@link TeamMatch} returned from the PubAPI endpoint.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-profile">Chess.com PubAPI documentation</a>
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-live-profile">Chess.com PubAPI documentation</a>
     */
    public TeamMatch getTeamMatchFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid team match API URL");
        }
        return getRequest(url, TeamMatch.class);
    }

    /**
     * Fetch a daily team match by its ID
     *
     * @param id The ID of the team match. This is the same as the ID in the team match web page's URL on www.chess.com
     * @return {@link TeamMatch} returned for the team match ID.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-profile">Chess.com PubAPI documentation</a>
     */
    public TeamMatch getDailyTeamMatchById(Integer id) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%d", ENDPOINT_BASE, id);
        return getRequest(endpoint, TeamMatch.class);
    }

    /**
     * Fetch a live team match by its ID
     *
     * @param id The ID of the team match. This is the same as the ID in the team match web page's URL on www.chess.com
     * @return {@link TeamMatch} returned for the team match ID.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-live-profile">Chess.com PubAPI documentation</a>
     */
    public TeamMatch getLiveTeamMatchById(Integer id) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/live/%d", ENDPOINT_BASE, id);
        return getRequest(endpoint, TeamMatch.class);
    }

    /**
     * Fetch a daily or live team match board by its PubAPI URL.
     *
     * @param url Chess.com PubAPI URL for the team match board.
     * @return {@link TeamMatchBoard} returned from the PubAPI endpoint.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-board">Chess.com PubAPI documentation</a>
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-live-board">Chess.com PubAPI documentation</a>
     */
    public TeamMatchBoard getTeamMatchBoardFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid team match board API URL");
        }
        return getRequest(url, TeamMatchBoard.class);
    }

    /**
     * Fetch a daily team match board by its team match ID and board number.
     *
     * @param teamMatchId The ID of the team match. This is the same as the ID in the team match web page's URL on www.chess.com.
     * @param boardId The board number.
     * @return {@link TeamMatchBoard} returned for the requested team match ID and board number.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-board">Chess.com PubAPI documentation</a>
     */
    public TeamMatchBoard getDailyTeamMatchBoard(Integer teamMatchId, Integer boardId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%d/%d", ENDPOINT_BASE, teamMatchId, boardId);
        return getRequest(endpoint, TeamMatchBoard.class);
    }

    /**
     * Fetch a live team match board by its team match ID and board number.
     *
     * @param teamMatchId The ID of the team match. This is the same as the ID in the team match web page's URL on www.chess.com.
     * @param boardId The board number.
     * @return {@link TeamMatchBoard} returned for the requested team match ID and board number.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-match-live-board">Chess.com PubAPI documentation</a>
     */
    public TeamMatchBoard getLiveTeamMatchBoard(Integer teamMatchId, Integer boardId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/live/%d/%d", ENDPOINT_BASE, teamMatchId, boardId);
        return getRequest(endpoint, TeamMatchBoard.class);
    }
}
