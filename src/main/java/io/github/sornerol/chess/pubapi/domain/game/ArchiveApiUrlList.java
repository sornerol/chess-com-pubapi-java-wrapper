package io.github.sornerol.chess.pubapi.domain.game;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for monthly archives API URLs
 */
@Getter
@Setter
@ToString
public class ArchiveApiUrlList {
    /**
     * List of monthly archive PubAPI URLs
     */
    @JsonProperty("archives")
    private List<String> archiveApiUrls;
}
