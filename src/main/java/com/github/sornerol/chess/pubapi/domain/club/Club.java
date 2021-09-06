package com.github.sornerol.chess.pubapi.domain.club;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.club.enums.ClubVisibility;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Contains a club's profile information
 */
@Getter
@Setter
@ToString
public class Club {
    /**
     * The self-referencing PubAPI URL
     */
    @JsonProperty("@id")
    private String id;

    /**
     * Club's name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Club's non-changing internal Chess.com ID
     */
    @JsonProperty("club_id")
    private Integer clubId;

    /**
     * Link to the club's icon
     */
    @JsonProperty("icon")
    private String iconUrl;

    /**
     * PubAPI URL for the club's associated country
     */
    @JsonProperty("country")
    private String countryApiUrl;

    /**
     * The average daily rating of club members
     */
    @JsonProperty("average_daily_rating")
    private Integer averageDailyRating;

    /**
     * Number of members in the club
     */
    @JsonProperty("members_count")
    private Integer membersCount;

    /**
     * Timestamp for the club's creation date as epoch time (seconds)
     */
    @JsonProperty("created")
    private Long created;

    /**
     * Timestamp for the club's last activity as epoch time (seconds)
     */
    @JsonProperty("last_activity")
    private Long lastActivity;

    /**
     * Whether the club's information is publicly visible on www.chess.com
     */
    @JsonProperty("visibility")
    private ClubVisibility visibility;

    /**
     * Link to submit a request to join the club
     */
    @JsonProperty("join_request")
    private String joinRequestUrl;

    /**
     * List of PubAPI URLs to player profiles for the club's admins
     */
    @JsonProperty("admin")
    private List<String> adminPlayerApiUrls;

    /**
     * Club description
     */
    @JsonProperty("description")
    private String description;

    /**
     * Club's web page URL on www.chess.com
     */
    @JsonProperty("url")
    private String url;
}

