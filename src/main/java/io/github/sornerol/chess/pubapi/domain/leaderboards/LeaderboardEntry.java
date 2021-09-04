package io.github.sornerol.chess.pubapi.domain.leaderboards;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.sornerol.chess.pubapi.domain.player.enums.MembershipStatus;
import io.github.sornerol.chess.pubapi.domain.player.enums.Title;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class LeaderboardEntry {
    @JsonProperty("player_id")
    private Integer playerId;

    @JsonProperty("@id")
    private String id;

    @JsonProperty("url")
    private String profileUrl;

    @JsonProperty("username")
    private String username;

    @JsonProperty("score")
    private Integer score;

    @JsonProperty("rank")
    private Integer rank;

    @JsonProperty("country")
    private String countryApiUrl;

    @JsonProperty("title")
    private Title title;

    @JsonProperty("name")
    private String name;

    @JsonProperty("status")
    private MembershipStatus membershipStatus;

    @JsonProperty("avatar")
    private String avatarUrl;

    @JsonProperty("trend_score")
    private Trend trendScore;

    @JsonProperty("trend_rank")
    private Trend trendRank;

    @JsonProperty("flair_code")
    private String flairCode;
}
