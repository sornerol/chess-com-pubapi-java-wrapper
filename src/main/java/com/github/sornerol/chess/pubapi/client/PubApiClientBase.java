package com.github.sornerol.chess.pubapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.sornerol.chess.pubapi.client.enums.ResponseCode;
import com.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import org.apache.commons.io.IOUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * The base class of all of the PubAPI client classes.
 */
abstract class PubApiClientBase {

    private final CloseableHttpClient httpClient;

    protected PubApiClientBase() {
        httpClient = HttpClients.createDefault();
    }

    /**Execute a GET request on the specified endpoint and deserialize the response into a domain object.
     *
     * @param endpoint The full Chess.com PubAPI URL.
     * @param clazz The class of the object to return.
     * @param <T> TDescribes the type parameter.
     * @return The deserialized object of the type specified.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     */
    protected <T> T getRequest(String endpoint, Class<T> clazz) throws IOException, ChessComPubApiException {
        String responseJson = getRequest(endpoint);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseJson, clazz);
    }

    /**Execute a GET request on the specified endpoint and return the response as a String.
     *
     * @param endpoint The full Chess.com PubAPI URL.
     * @return The deserialized object of the type specified.
     * @throws IOException if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     */
    protected String getRequest(String endpoint) throws IOException, ChessComPubApiException {
        HttpGet request = new HttpGet(endpoint);

        String responseBody;
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            int statusCode = response.getStatusLine().getStatusCode();
            //TODO: Handle rate throttling more gracefully
            if (statusCode != ResponseCode.OK.getValue()) {
                throw new ChessComPubApiException("Error executing GET request: API returned status code " + statusCode);
            }
            InputStream inputStream = response.getEntity().getContent();
            responseBody = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        }
        return responseBody;
    }
}
