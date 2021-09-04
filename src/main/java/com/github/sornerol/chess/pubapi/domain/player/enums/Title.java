package com.github.sornerol.chess.pubapi.domain.player.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

public enum Title {
    GM("GM"),
    WGM("WGM"),
    IM("IM"),
    WIM("WIM"),
    FM("FM"),
    WFM("WFM"),
    NM("NM"),
    WNM("WNM"),
    CM("CM"),
    WCM("WCM");

    @Getter
    @JsonValue
    private final String value;

    Title(String value) {
        this.value = value;
    }
}
