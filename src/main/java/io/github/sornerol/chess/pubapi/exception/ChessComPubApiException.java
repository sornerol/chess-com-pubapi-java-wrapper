package io.github.sornerol.chess.pubapi.exception;

/**
 * This exception is thrown whenever a request to the Chess.com PubAPI returns a non-success return code, or when data
 * fails validation.
 */
public class ChessComPubApiException extends Exception{
    public ChessComPubApiException(String message) {
        super(message);
    }
}
