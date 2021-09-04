package io.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.club.enums.ClubVisibility;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Club {
    @JsonProperty("@id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("club_id")
    private Integer clubId;

    @JsonProperty("icon")
    private String iconUrl;

    @JsonProperty("country")
    private String countryApiUrl;

    @JsonProperty("average_daily_rating")
    private Integer averageDailyRating;

    @JsonProperty("members_count")
    private Integer membersCount;

    @JsonProperty("created")
    private Long created;

    @JsonProperty("last_activity")
    private Long lastActivity;

    @JsonProperty("visibility")
    private ClubVisibility visibility;

    @JsonProperty("join_request")
    private String joinRequestUrl;

    @JsonProperty("admin")
    private List<String> adminPlayerApiUrls;

    @JsonProperty("description")
    private String description;

    @JsonProperty("url")
    private String url;
}

