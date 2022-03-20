package io.github.sornerol.chess.pubapi.domain.country;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Contains information about a country recognized by the Chess.com platform
 */
@Getter
@Setter
@ToString
public class Country {
    /**
     * Self-referencing PubAPI URL for this country
     */
    @JsonProperty("@id")
    private String id;

    /**
     * Country's name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Country's ISO 3166 code
     */
    @JsonProperty("code")
    private String code;
}
