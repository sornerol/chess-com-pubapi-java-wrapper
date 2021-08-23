package io.github.sornerol.chess.pubapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sornerol.chess.pubapi.client.enums.ResponseCode;
import lombok.extern.java.Log;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;

@Log
public class ChessComPubApiClient {
    private static final String CHESS_COM_API_URL_BASE = "https://api.chess.com/pub/";

    private final CloseableHttpClient httpClient;

    public ChessComPubApiClient() {
        httpClient = HttpClients.createDefault();
    }

    public <T> T getRequest(String endpoint, Class<T> clazz) throws IOException {

        HttpGet request = new HttpGet(CHESS_COM_API_URL_BASE + endpoint);

        CloseableHttpResponse response = httpClient.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        //TODO: Handle rate throttling more gracefully
        if (statusCode != ResponseCode.OK.getValue()) {
            log.severe("Error executing GET request: API returned status code " + statusCode);
            return null;
        }
        InputStream responseJson = response.getEntity().getContent();
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseJson, clazz);
    }
}
