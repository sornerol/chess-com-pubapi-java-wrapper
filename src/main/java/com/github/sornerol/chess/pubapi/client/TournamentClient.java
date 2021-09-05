package com.github.sornerol.chess.pubapi.client;

import com.github.sornerol.chess.pubapi.domain.tournament.Tournament;
import com.github.sornerol.chess.pubapi.domain.tournament.TournamentRound;
import com.github.sornerol.chess.pubapi.domain.tournament.TournamentRoundGroup;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

/**
 * Client for fetching data related to tournaments.
 *
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournaments">Chess.com PubAPI documentation</a>
 */
public class TournamentClient extends PubApiClientBase {

    /**
     * The base URL of the endpoint queried by requests from this client (https://api.chess.com/pub/tournament).
     */
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/tournament";

    /**
     * Fetch tournament information by its PubAPI URL.
     *
     * @param url Chess.com PubAPI URL for the tournament.
     * @return {@link Tournament} from the API URL.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournament-profile">Chess.com PubAPI documentation</a>
     */
    public Tournament getTournamentFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid tournament API URL");
        }
        return getRequest(url, Tournament.class);
    }

    /**
     * Fetch tournament information by its URL ID.
     *
     * @param urlId The URL ID for the tournament. This is the same as the URL ID found in the tournament's web page url on www.chess.com.
     * @return {@link Tournament} for the URL ID.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournament-profile">Chess.com PubAPI documentation</a>
     */
    public Tournament getTournamentByUrlId(String urlId) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, urlId);
        return getRequest(endpoint, Tournament.class);
    }

    /**
     * Fetch information about a tournament round by the tournament URL ID and round number.
     *
     * @param urlId The URL ID for the tournament. This is the same as the URL ID found in the tournament's web page url on www.chess.com.
     * @param round The round number to retrieve.
     * @return {@link TournamentRound} for the URL ID and round number.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournament-round">Chess.com PubAPI documentation</a>
     */
    public TournamentRound getTournamentRound(String urlId, Integer round) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/%d", ENDPOINT_BASE, urlId, round);
        return getRequest(endpoint, TournamentRound.class);
    }

    /**
     * Fetch information about a tournament round by the PubAPI url.
     *
     * @param url The PubAPI URL for the tournament round.
     * @return {@link TournamentRound} from the PubAPI URL.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournament-round">Chess.com PubAPI documentation</a>
     */
    public TournamentRound getTournamentRoundByApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid tournament API URL");
        }
        return getRequest(url, TournamentRound.class);
    }

    /**
     * Fetch information about a tournament round's group by the URL ID, round number, and group number.
     *
     * @param urlId The URL ID for the tournament. This is the same as the URL ID found in the tournament's web page url on www.chess.com.
     * @param round The round number.
     * @param group The group number within the round.
     * @return {@link TournamentRoundGroup} for the specified parameters.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournament-round-group">Chess.com PubAPI documentation</a>
     */
    public TournamentRoundGroup getTournamentRoundGroup(String urlId, Integer round, Integer group) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/%d/%d", ENDPOINT_BASE, urlId, round, group);
        return getRequest(endpoint, TournamentRoundGroup.class);
    }

    /**
     * Fetch information about a tournament round's group by the PubAPI url.
     *
     * @param url The PubAPI URL for the tournament round's group.
     * @return {@link TournamentRoundGroup} from the PubAPI URL.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-tournament-round-group">Chess.com PubAPI documentation</a>
     */
    public TournamentRoundGroup getTournamentRoundGroupByApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid tournament API URL");
        }
        return getRequest(url, TournamentRoundGroup.class);
    }
}
