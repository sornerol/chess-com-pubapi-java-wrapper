package io.github.sornerol.chess.pubapi.domain.leaderboards;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.player.enums.MembershipStatus;
import io.github.sornerol.chess.pubapi.domain.player.enums.Title;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Contains details for a player on a leaderboard.
 */
@ToString
@Getter
@Setter
public class LeaderboardEntry {
    /**
     * The player's non-changing internal Chess.com ID
     */
    @JsonProperty("player_id")
    private Integer playerId;

    /**
     * Link to the player's PubAPI profile
     */
    @JsonProperty("@id")
    private String playerApiUrl;

    /**
     * Link to the player's profile on www.chess.com
     */
    @JsonProperty("url")
    private String profileUrl;

    /**
     * Player's username
     */
    @JsonProperty("username")
    private String username;

    /**
     * Player's rating in the category
     */
    @JsonProperty("score")
    private Integer score;

    /**
     * Player's leaderboard ranking
     */
    @JsonProperty("rank")
    private Integer rank;

    /**
     * PubAPI link for the player's registered country
     */
    @JsonProperty("country")
    private String countryApiUrl;

    /**
     * Player's FIDE or national federation title, if known
     */
    @JsonProperty("title")
    private Title title;

    /**
     * The player's name
     */
    @JsonProperty("name")
    private String name;

    /**
     * The player's membership status
     */
    @JsonProperty("status")
    private MembershipStatus membershipStatus;

    /**
     * A link to the player's avatar image
     */
    @JsonProperty("avatar")
    private String avatarUrl;

    /**
     * Trend information for the player's score
     */
    @JsonProperty("trend_score")
    private Trend trendScore;

    /**
     * Trend information for the player's leaderboard rank
     */
    @JsonProperty("trend_rank")
    private Trend trendRank;

    /**
     * The player's flair icon code
     */
    @JsonProperty("flair_code")
    private String flairCode;
}
