package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.game.ArchiveApiUrlList;
import io.github.sornerol.chess.pubapi.domain.game.ArchiveGameList;
import io.github.sornerol.chess.pubapi.domain.game.GameList;
import io.github.sornerol.chess.pubapi.domain.player.Player;
import io.github.sornerol.chess.pubapi.domain.player.PlayerList;
import io.github.sornerol.chess.pubapi.domain.player.PlayerOnline;
import io.github.sornerol.chess.pubapi.domain.player.club.PlayerClubList;
import io.github.sornerol.chess.pubapi.domain.player.enums.Title;
import io.github.sornerol.chess.pubapi.domain.player.match.MatchHistory;
import io.github.sornerol.chess.pubapi.domain.player.stats.PlayerStats;
import io.github.sornerol.chess.pubapi.domain.player.tournament.TournamentHistory;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;
import java.util.List;

/**
 * Client for fetching data about players.
 *
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player">Chess.com PubAPI documentation</a>
 */
public class PlayerClient extends PubApiClientBase {
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/player";
    private static final String TITLED_PLAYERS_ENDPOINT_BASE = "https://api.chess.com/pub/titled";

    /**
     * Fetch player data using a Chess.com PubAPI URL.
     *
     * @param url Chess.com PubAPI URL to player.
     * @return {@link Player} data from the API URL.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player">Chess.com PubAPI documentation</a>
     */
    public Player getPlayerFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid player profile URL");
        }
        return getRequest(url, Player.class);
    }

    /**
     * Fetch player data for a username.
     *
     * @param username The player's username.
     * @return {@link Player} data for the username.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player">Chess.com PubAPI documentation</a>
     */
    public Player getPlayerByUsername(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, username);
        return getRequest(endpoint, Player.class);
    }

    /**
     * Fetch a list of players with a specific title.
     *
     * @param title The {@link Title} search for.
     * @return A list of usernames of players with the specified title.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-titled">Chess.com PubAPI documentation</a>
     */
    public List<String> getPlayersWithTitle(Title title) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s",TITLED_PLAYERS_ENDPOINT_BASE, title);
        return getRequest(endpoint, PlayerList.class).getPlayers();
    }

    /**
     * Fetch a player's statistics data.
     *
     * @param username The player's username.
     * @return {@link PlayerStats} for the requested player.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player-stats">Chess.com PubAPI documentation</a>
     */
    public PlayerStats getStatsForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/stats", ENDPOINT_BASE, username);
        return getRequest(endpoint, PlayerStats.class);
    }

    /**
     * Fetch a player's statistics data from the full PubAPI URL.
     *
     * @param url Chess.com PubAPI URL to player's statistics.
     * @return {@link PlayerStats} for the requested player.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player-stats">Chess.com PubAPI documentation</a>
     */
    public PlayerStats getStatsForPlayerFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE) || !url.endsWith("/stats")) {
            throw new ChessComPubApiException("URL is not a valid player stats URL");
        }
        return getRequest(url, PlayerStats.class);
    }

    /**
     * Fetch a player's online status.
     *
     * @param username The player's username.
     * @return True if the player has been online in the past 5 minutes; false otherwise.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player-is-online">Chess.com PubAPI documentation</a>
     */
    public Boolean isPlayerOnline(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/is-online", ENDPOINT_BASE, username);
        return getRequest(endpoint, PlayerOnline.class).getOnline();
    }

    /**
     * Fetch a player's active daily chess games.
     *
     * @param username The player's username.
     * @return {@link GameList} containing all of the player's ongoing daily chess games.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-games-current">Chess.com PubAPI documentation</a>
     */
    public GameList getCurrentDailyChessGamesForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/games", ENDPOINT_BASE, username);
        return getRequest(endpoint, GameList.class);
    }

    /**
     * Fetch a player's active daily chess games where it is his/her turn to move.
     *
     * @param username The player's username.
     * @return {@link GameList} containing all of the player's to-move daily chess games.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-games-tomove">Chess.com PubAPI documentation</a>
     */
    public GameList getToMoveDailyChessGamesForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/games/to-move", ENDPOINT_BASE, username);
        return getRequest(endpoint, GameList.class);
    }

    /**
     * Fetch a list of monthly archives available for a player.
     *
     * @param username The player's username.
     * @return {@link ArchiveApiUrlList} containing a list of PubAPI URLs to monthly archives available for the player.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-games-archive-list">Chess.com PubAPI documentation</a>
     */
    public ArchiveApiUrlList getMonthlyArchivesAvailableForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/games/archives", ENDPOINT_BASE, username);
        return getRequest(endpoint, ArchiveApiUrlList.class);
    }

    /**
     * Fetch a player's monthly game archive.
     *
     * @param username The player's username.
     * @param year     The year of the archive (e.g. 2020).
     * @param month    The month number for the archive (e.g. 12 for December).
     * @return {@link ArchiveGameList} containing the player's game archive for the requested month.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code, or if the month parameter is not valid.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-games-archive">Chess.com PubAPI documentation</a>
     */
    public ArchiveGameList getMonthlyArchiveForPlayer(String username,
                                                      Integer year,
                                                      Integer month) throws IOException, ChessComPubApiException {
        if (month < 1 || month > 12) {
            throw new ChessComPubApiException("Month must be between 1 and 12");
        }
        String endpoint = String.format("%s/%s/games/%04d/%02d", ENDPOINT_BASE, username, year, month);
        return getRequest(endpoint, ArchiveGameList.class);
    }

    /**
     * Fetch a player's monthly game archive using the PubAPI URL.
     *
     * @param url Chess.com PubAPI URL to player's monthly archive
     * @return {@link ArchiveGameList} containing the player's game archive for the requested month.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if the URL is not valid, or if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-games-archive">Chess.com PubAPI documentation</a>
     */
    public ArchiveGameList getMonthlyArchiveForPlayerFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid player profile URL");
        }
        return getRequest(url, ArchiveGameList.class);
    }

    /**
     * Fetch a player's monthly game archive as a multi-game PGN.
     *
     * @param username The player's username.
     * @param year     The year of the archive (e.g. 2020).
     * @param month    The month number for the archive (e.g. 12 for December).
     * @return String containing the multi-game PGN.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code, or if the month parameter is not valid.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-games-pgn">Chess.com PubAPI documentation</a>
     */
    public String getMonthlyArchiveForPlayerAsPgn(String username,
                                                  Integer year,
                                                  Integer month) throws IOException, ChessComPubApiException {
        if (month < 1 || month > 12) {
            throw new ChessComPubApiException("Month must be between 1 and 12");
        }
        String endpoint = String.format("%s/%s/games/%04d/%02d/pgn", ENDPOINT_BASE, username, year, month);
        return getRequest(endpoint);
    }

    /**
     * Fetch a list of clubs a player is a member of.
     *
     * @param username The player's username.
     * @return {@link PlayerClubList} containing the player's joined clubs.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player-clubs">Chess.com PubAPI documentation</a>
     */
    public PlayerClubList getClubsForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/clubs", ENDPOINT_BASE, username);
        return getRequest(endpoint, PlayerClubList.class);
    }

    /**
     * Fetch a list of team matches the player is playing in, has played in, or is registered for.
     *
     * @param username The player's username.
     * @return {@link MatchHistory} for the requested player.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player-matches">Chess.com PubAPI documentation</a>
     */
    public MatchHistory getTeamMatchesForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/matches", ENDPOINT_BASE, username);
        return getRequest(endpoint, MatchHistory.class);
    }

    /**
     * Fetch a list of tournaments the player is playing in, has played in, or is registered for.
     *
     * @param username The player's username.
     * @return {@link TournamentHistory} for the requested player.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-endpoint-player-tournaments">Chess.com PubAPI documentation</a>
     */
    public TournamentHistory getTournamentsForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/tournaments", ENDPOINT_BASE, username);
        return getRequest(endpoint, TournamentHistory.class);
    }
}
