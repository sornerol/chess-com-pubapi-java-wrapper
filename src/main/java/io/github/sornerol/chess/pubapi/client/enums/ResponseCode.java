package io.github.sornerol.chess.pubapi.client.enums;

import lombok.Getter;

public enum ResponseCode {
    OK(200),
    MOVED(301),
    NOT_CHANGED(304),
    NOT_FOUND(404),
    GONE(410),
    RATE_LIMIT_EXCEEDED(429);

    @Getter private final int value;

    ResponseCode(int value) {
        this.value = value;
    }
}
