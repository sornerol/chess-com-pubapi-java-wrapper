package com.github.sornerol.chess.pubapi.client.enums;

import lombok.Getter;

/**
 * Response codes that can be returned by Chess.com's PubAPI.
 *
 * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-response-codes">Chess.com PubAPI response codes.</a>
 */
public enum ResponseCode {
    /**
     * The request was successful.
     */
    OK(200),

    /**
     * The URL you requested is bad, but we know where it should be; your client should remember and correct this to use the new URL in future requests.
     */
    MOVED(301),

    /**
     * If your client supports "ETag/If-None-Match" or "Last-Modified/If-Modified-Since" caching headers and the data have not changed since the last request.
     */
    NOT_CHANGED(304),

    /**
     * The URL is malformed, or the data requested is not available (e.g. a username for a user that doesn't exist).
     */
    NOT_FOUND(404),

    /**
     * No data will ever be available at the URL you requested; your client should not request this URL again.
     */
    GONE(410),

    /**
     * Chess.com is refusing to interpret your request due to rate limits.
     *
     * @see <a href="https://www.chess.com/news/view/published-data-api#pubapi-general-rate-limits">Chess.com PubAPI rate limiting.</a>
     */
    RATE_LIMIT_EXCEEDED(429);

    @Getter
    private final int value;

    ResponseCode(int value) {
        this.value = value;
    }
}
