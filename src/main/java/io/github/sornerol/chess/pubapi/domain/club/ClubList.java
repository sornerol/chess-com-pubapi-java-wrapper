package io.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class for returning a list of clubs
 */
@Getter
@Setter
@ToString
public class ClubList {
    /**
     * List of club PubAPI URLs
     */
    @JsonProperty("clubs")
    List<String> clubsApiUrls;
}
