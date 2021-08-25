package io.github.sornerol.chess.pubapi.domain.player;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Player {

    @JsonProperty("@id")
    @Getter @Setter
    private String id;

    @JsonProperty("url")
    @Getter @Setter
    private String url;

    @JsonProperty("username")
    @Getter @Setter
    private String username;

    @JsonProperty("player_id")
    @Getter @Setter
    private Integer playerId;

    @JsonProperty("title")
    @Getter @Setter
    private String title;

    @JsonProperty("status")
    @Getter @Setter
    private String status;

    @JsonProperty("name")
    @Getter @Setter
    private String name;

    @JsonProperty("avatar")
    @Getter @Setter
    private String avatarUrl;

    @JsonProperty("location")
    @Getter @Setter
    private String location;

    @JsonProperty("country")
    @Getter @Setter
    private String countryApiUrl;

    @JsonProperty("joined")
    @Getter @Setter
    private Long joined;

    @JsonProperty("last_online")
    @Getter @Setter
    private Long lastOnline;

    @JsonProperty("followers")
    @Getter @Setter
    private Integer followers;

    @JsonProperty("is_streamer")
    @Getter @Setter
    private Boolean isStreamer;

    @JsonProperty("twitch_url")
    @Getter @Setter
    private String twitchUrl;

    @JsonProperty("fide")
    @Getter @Setter
    private Integer fideRating;

}
