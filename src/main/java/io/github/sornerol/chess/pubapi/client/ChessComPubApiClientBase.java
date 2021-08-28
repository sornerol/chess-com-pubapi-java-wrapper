package io.github.sornerol.chess.pubapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sornerol.chess.pubapi.client.enums.ResponseCode;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;
import lombok.extern.java.Log;
import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@Log
public abstract class ChessComPubApiClientBase {
    private static final String CHESS_COM_API_URL_BASE = "https://api.chess.com/pub/";

    private final CloseableHttpClient httpClient;

    public ChessComPubApiClientBase() {
        httpClient = HttpClients.createDefault();
    }

    <T> T getRequest(String endpoint, Class<T> clazz) throws IOException, ChessComPubApiException {
        String responseJson = getRequest(endpoint);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseJson, clazz);
    }

    String getRequest(String endpoint) throws IOException, ChessComPubApiException {
        HttpGet request = new HttpGet(CHESS_COM_API_URL_BASE + endpoint);

        CloseableHttpResponse response = httpClient.execute(request);
        int statusCode = response.getStatusLine().getStatusCode();
        //TODO: Handle rate throttling more gracefully
        if (statusCode != ResponseCode.OK.getValue()) {
            throw new ChessComPubApiException("Error executing GET request: API returned status code " + statusCode);
        }
        InputStream inputStream = response.getEntity().getContent();
        return IOUtils.toString(inputStream, StandardCharsets.UTF_8);
    }
}
