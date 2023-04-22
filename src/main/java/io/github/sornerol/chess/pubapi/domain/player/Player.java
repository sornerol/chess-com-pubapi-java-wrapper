package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.player.enums.MembershipStatus;
import io.github.sornerol.chess.pubapi.domain.player.enums.Title;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Details about a player
 */
@Getter
@Setter
@ToString
public class Player {
    /**
     * Self-referencing PubAPI URL for this player
     */
    @JsonProperty("@id")
    private String id;

    /**
     * Player's profile page on www.chess.com
     */
    @JsonProperty("url")
    private String url;

    /**
     * Player's username
     */
    @JsonProperty("username")
    private String username;

    /**
     * Player's non-changing internal ID on Chess.com
     */
    @JsonProperty("player_id")
    private Integer playerId;

    /**
     * Player's FIDE or national federation title
     */
    @JsonProperty("title")
    private Title title;

    /**
     * Player's membership status
     */
    @JsonProperty("status")
    private MembershipStatus membershipStatus;

    /**
     * Player's name
     */
    @JsonProperty("name")
    private String name;

    /**
     * Link to player's avatar
     */
    @JsonProperty("avatar")
    private String avatarUrl;

    /**
     * Player's location
     */
    @JsonProperty("location")
    private String location;

    /**
     * Link to PubAPI profile for player's country
     */
    @JsonProperty("country")
    private String countryApiUrl;

    /**
     * Player's joined date as epoch time (seconds)
     */
    @JsonProperty("joined")
    private Long joined;

    /**
     * Player's last online timestamp as epoch time (seconds)
     */
    @JsonProperty("last_online")
    private Long lastOnline;

    /**
     * Number of followers
     */
    @JsonProperty("followers")
    private Integer followers;

    /**
     * Whether the player is a streamer
     */
    @JsonProperty("is_streamer")
    private Boolean isStreamer;

    /**
     * Player's Twitch.tv profile page
     */
    @JsonProperty("twitch_url")
    private String twitchUrl;

    /**
     * Player's self-reported over-the-board rating
     */
    @JsonProperty("fide")
    private Integer fideRating;
    
        /**
     * True if the Player is verified
     */
    @JsonProperty("verified")
    private Boolean verified;

    /**
     * The Players league
     */
    @JsonProperty("league")
    private String league;
}
