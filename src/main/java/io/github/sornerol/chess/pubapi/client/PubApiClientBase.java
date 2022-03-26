package io.github.sornerol.chess.pubapi.client;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.sornerol.chess.pubapi.client.enums.ResponseCode;
import io.github.sornerol.chess.pubapi.client.enums.RetryStrategy;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.io.IOUtils;
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
     * Default value for retryInterval.
     */
    public static final Integer DEFAULT_RETRY_INTERVAL = 3;

    /**
     * Default value for maxRetries.
     */
    public static final Integer DEFAULT_MAX_RETRIES = 2;

    /**
     * Default value for retryStrategy.
     */
    public static final RetryStrategy DEFAULT_RETRY_STRATEGY = RetryStrategy.RETRY_N_TIMES;

    /**
     * If supplied, the userAgent value will be passed in the User-Agent header when making requests to Chess.com.
     * By specifying this value with your contact information, Chess.com can contact you in the event they need to
     * block access for your application.
     *
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-rate-limits">Rate Limiting</a>
     */
    @Getter
    @Setter
    private String userAgent;

    /**
     * Number of seconds to wait before retrying if a request fails due to a 429 response code. If retryStrategy is set
     * to NEVER, this field does nothing.
     *
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-rate-limits">Rate Limiting</a>
     */
    @Getter
    @Setter
    private Integer retryInterval;

    /**
     * Maximum number of retries when retryStrategy is RETRY_N_TIMES. This does not include the initial attempt
     * (e.g. if maxRetries is 2, the client will make three total attempts before giving up).
     *
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-rate-limits">Rate Limiting</a>
     */
    @Getter
    @Setter
    private Integer maxRetries;

    /**
     * Defines the behavior to use when receiving a 429 response from the Chess.com API.
     *
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-rate-limits">Rate Limiting</a>
     */
    @Getter
    @Setter
    private RetryStrategy retryStrategy;

    private final CloseableHttpClient httpClient;

    protected PubApiClientBase() {
        httpClient = HttpClients.createDefault();
        retryInterval = DEFAULT_RETRY_INTERVAL;
        maxRetries = DEFAULT_MAX_RETRIES;
        retryStrategy = DEFAULT_RETRY_STRATEGY;
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
        Integer attempts = 1;

        boolean keepTrying = false;
        do {
            try (CloseableHttpResponse response = httpClient.execute(request)) {
                int statusCode = response.getStatusLine().getStatusCode();
                if (statusCode == ResponseCode.RATE_LIMIT_EXCEEDED.getValue() && shouldTryRequestAgain(attempts)) {
                    keepTrying = true;
                    attempts++;
                    Thread.sleep(retryInterval * 1000);
                } else if (statusCode != ResponseCode.OK.getValue()) {
                    throw new ChessComPubApiException("Error executing GET request: API returned status code " + statusCode);
                }
                InputStream inputStream = response.getEntity().getContent();
                responseBody = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
            } catch (InterruptedException e) {
                throw new ChessComPubApiException("Error while executing request: " + e.getMessage());
            }
        } while (keepTrying);

        return responseBody;
    }

    private boolean shouldTryRequestAgain(Integer attemptsSoFar) {
        if (retryStrategy == RetryStrategy.RETRY_FOREVER) {
            return true;
        }

        return retryStrategy == RetryStrategy.RETRY_N_TIMES && attemptsSoFar <= maxRetries;
    }
}
