package io.github.sornerol.chess.pubapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sornerol.chess.pubapi.client.enums.ResponseCode;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.IOUtils;
import org.apache.http.Header;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * The base class of all the PubAPI client classes.
 */
abstract class PubApiClientBase {

    /**
     * If supplied, the userAgent value will be passed in the User-Agent header when making requests to Chess.com.
     * By specifying this value with your contact information, Chess.com can contact you in the event they need to
     * block access for your application.
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-rate-limits">Rate Limiting</a>
     */
    @Getter
    @Setter
    private String userAgent;

    private final CloseableHttpClient httpClient;

    protected PubApiClientBase() {
        httpClient = HttpClients.createDefault();
    }

    /**
     * Execute a GET request on the specified endpoint and deserialize the response into a domain object.
     *
     * @param endpoint The full Chess.com PubAPI URL.
     * @param clazz    The class of the object to return.
     * @param <T>      TDescribes the type parameter.
     * @return The deserialized object of the type specified.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     */
    protected <T> T getRequest(String endpoint, Class<T> clazz) throws IOException, ChessComPubApiException {
        String responseJson = getRequest(endpoint);

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(responseJson, clazz);
    }

    /**
     * Execute a GET request on the specified endpoint and return the response as a String.
     *
     * @param endpoint The full Chess.com PubAPI URL.
     * @return The deserialized object of the type specified.
     * @throws IOException             if there is a problem connecting to Chess.com.
     * @throws ChessComPubApiException if Chess.com returns a non-success response code.
     */
    protected String getRequest(String endpoint) throws IOException, ChessComPubApiException {
        HttpGet request = new HttpGet(endpoint);
        if (userAgent != null) {
            request.addHeader(new BasicHeader("User-Agent", userAgent));
        }

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
