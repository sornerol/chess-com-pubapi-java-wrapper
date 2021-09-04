package com.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.sornerol.chess.pubapi.domain.player.enums.MembershipStatus;
import com.github.sornerol.chess.pubapi.domain.player.enums.Title;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Player {

    @JsonProperty("@id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("username")
    private String username;

    @JsonProperty("player_id")
    private Integer playerId;

    @JsonProperty("title")
    private Title title;

    @JsonProperty("status")
    private MembershipStatus membershipStatus;

    @JsonProperty("name")
    private String name;

    @JsonProperty("avatar")
    private String avatarUrl;

    @JsonProperty("location")
    private String location;

    @JsonProperty("country")
    private String countryApiUrl;

    @JsonProperty("joined")
    private Long joined;

    @JsonProperty("last_online")
    private Long lastOnline;

    @JsonProperty("followers")
    private Integer followers;

    @JsonProperty("is_streamer")
    private Boolean isStreamer;

    @JsonProperty("twitch_url")
    private String twitchUrl;

    @JsonProperty("fide")
    private Integer fideRating;
}
