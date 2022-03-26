package io.github.sornerol.chess.pubapi.client.enums;

/**
 * Specifies a retry strategy for the base client. When the Chess.com API returns a 429 response code, the base client
 * will attempt to retry the request according to the specified retry strategy.
 */
public enum RetryStrategy {

    /**
     * Don't retry the request. In this case, the client will throw an exception if the request fails due to a 429 response.
     */
    NEVER,

    /**
     * Retry a specified number of times. The number of times to retry is specified in the client's maxRetries property. This is the default behavior
     */
    RETRY_N_TIMES,

    /**
     * If a request fails due to a 429 response, keep retrying indefinitely. This behavior is not recommended, since it could theoretically
     * lead to an infinite loop.
     */
    RETRY_FOREVER
}
