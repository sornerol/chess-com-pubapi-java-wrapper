package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.player.Player;
import io.github.sornerol.chess.pubapi.domain.player.PlayerList;
import io.github.sornerol.chess.pubapi.domain.player.PlayerOnline;
import io.github.sornerol.chess.pubapi.domain.player.enums.Title;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;
import lombok.extern.java.Log;

import java.io.IOException;
import java.util.List;

@Log
public class PlayerClient {
    private static final String ENDPOINT_BASE = "player/";
    private final ChessComPubApiClient apiClient;

    public PlayerClient() {
        apiClient = new ChessComPubApiClient();
    }

    public Player loadPlayer(String userName) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s", ENDPOINT_BASE, userName);
        return apiClient.getRequest(endpoint, Player.class);
    }

    public List<String> playersWithTitle(Title title) throws IOException, ChessComPubApiException {
        String endpoint = String.format("titled/%s", title);
        return apiClient.getRequest(endpoint, PlayerList.class).getPlayers();
    }

    //player stats

    public Boolean isPlayerOnline(String userName) throws IOException, ChessComPubApiException {
        String endpoint = String.format("%s/%s/is-online", ENDPOINT_BASE, userName);
        return apiClient.getRequest(endpoint, PlayerOnline.class).getOnline();
    }

    //daily chess games in progress

    //daily chess - to move

    //games archive

    //finished games by year/month

    //pgn file download of all games for year/month

    //player's clubs

    //player's team matches

    //player's tournaments
}
