package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.player.Player;
import lombok.extern.java.Log;

import java.io.IOException;

@Log
public class PlayerClient {

    private final ChessComPubApiClient apiClient;

    public PlayerClient() {
        apiClient = new ChessComPubApiClient();
    }

    public Player loadPlayer(String userName) {
        String endpoint = String.format("player/%s", userName);
        try {
            return apiClient.getRequest(endpoint, Player.class);
        } catch (IOException e) {
            String errorMessage = String.format("Error loading player %s: %s", userName, e.getMessage());
            log.severe(errorMessage);
            return null;
        }
    }
}
