package io.github.sornerol.chess.pubapi.domain.player.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class ArchiveApiUrlList {
    @JsonProperty("archives")
    @Getter
    @Setter
    private List<String> archiveApiUrls;
}
