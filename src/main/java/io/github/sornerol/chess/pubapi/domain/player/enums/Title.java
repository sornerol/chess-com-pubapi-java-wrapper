package io.github.sornerol.chess.pubapi.domain.player.enums;

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

    @Getter private final String value;

    Title(String value) {
        this.value = value;
    }
}
