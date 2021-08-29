package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.player.*;
import io.github.sornerol.chess.pubapi.domain.player.club.ClubList;
import io.github.sornerol.chess.pubapi.domain.player.enums.Title;
import io.github.sornerol.chess.pubapi.domain.player.game.ArchiveApiUrlList;
import io.github.sornerol.chess.pubapi.domain.player.game.ArchiveGameList;
import io.github.sornerol.chess.pubapi.domain.player.game.GameList;
import io.github.sornerol.chess.pubapi.domain.player.stats.PlayerStats;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;
import java.util.List;

public class PlayerClient extends PubApiClientBase {
    private static final String ENDPOINT_BASE = "https://api.chess.com/pub/player";

    public Player loadPlayerFromApiUrl(String url) throws IOException, ChessComPubApiException {
        if (!url.startsWith(ENDPOINT_BASE)) {
            throw new ChessComPubApiException("URL is not a valid player profile URL");
        }
        return getRequest(url, Player.class);
    }

    public Player loadPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, username);
        return getRequest(endpoint, Player.class);
    }

    public List<String> playersWithTitle(Title title) throws IOException, ChessComPubApiException {
        String endpoint = String.format("titled/%s", title);
        return getRequest(endpoint, PlayerList.class).getPlayers();
    }

    public PlayerStats statsForPlayer(String username) throws IOException, ChessComPubApiException{
        String endpoint = String.format("%s/%s/stats", ENDPOINT_BASE, username);
        return getRequest(endpoint, PlayerStats.class);
    }

    public Boolean isPlayerOnline(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/is-online", ENDPOINT_BASE, username);
        return getRequest(endpoint, PlayerOnline.class).getOnline();
    }

    public GameList currentDailyChessGamesForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/games", ENDPOINT_BASE, username);
        return getRequest(endpoint, GameList.class);
    }

    public GameList toMoveDailyChessGamesForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/games/to-move", ENDPOINT_BASE, username);
        return getRequest(endpoint, GameList.class);
    }

    public ArchiveApiUrlList monthlyArchivesAvailableForPlayer(String username) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/games/archives", ENDPOINT_BASE, username);
        return getRequest(endpoint, ArchiveApiUrlList.class);
    }

    public ArchiveGameList monthlyArchiveForPlayer(String username,
                                                  Integer year,
                                                  Integer month) throws IOException, ChessComPubApiException {
        if (month < 1 || month > 12) {
            throw new ChessComPubApiException("Month must be between 1 and 12");
        }
        String endpoint = String.format("%s/%s/games/%04d/%02d", ENDPOINT_BASE, username, year, month);
        return getRequest(endpoint, ArchiveGameList.class);
    }

    public String monthlyPgnArciveForPlayer(String username,
                                      Integer year,
                                      Integer month) throws IOException, ChessComPubApiException {
        if (month < 1 || month > 12) {
            throw new ChessComPubApiException("Month must be between 1 and 12");
        }
        String endpoint = String.format("%s/%s/games/%04d/%02d/pgn", ENDPOINT_BASE, username, year, month);
        return getRequest(endpoint);
    }

    public ClubList clubsForPlayer(String username) throws  IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/clubs", ENDPOINT_BASE, username);
        return getRequest(endpoint, ClubList.class);
    }

    //player's team matches

    //player's tournaments
}
