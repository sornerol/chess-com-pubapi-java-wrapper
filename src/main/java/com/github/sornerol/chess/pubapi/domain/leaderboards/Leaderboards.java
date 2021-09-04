package com.github.sornerol.chess.pubapi.domain.leaderboards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
public class Leaderboards {
    @JsonProperty("daily")
    private List<LeaderboardEntry> dailyLeaderboard;

    @JsonProperty("daily960")
    private List<LeaderboardEntry> daily960Leaderboard;

    @JsonProperty("live_rapid")
    private List<LeaderboardEntry> liveRapidLeaderboard;

    @JsonProperty("live_blitz")
    private List<LeaderboardEntry> liveBlitzLeaderboard;

    @JsonProperty("live_bullet")
    private List<LeaderboardEntry> liveBulletLeaderboard;

    @JsonProperty("live_bughouse")
    private List<LeaderboardEntry> liveBughouseLeaderboard;

    @JsonProperty("live_blitz960")
    private List<LeaderboardEntry> liveBlitz960Leaderboard;

    @JsonProperty("live_threecheck")
    private List<LeaderboardEntry> liveThreeCheckLeaderboard;

    @JsonProperty("live_crazyhouse")
    private List<LeaderboardEntry> liveCrazyhouseLeaderboard;

    @JsonProperty("live_kingofthehill")
    private List<LeaderboardEntry> liveKingOfTheHillLeaderboard;

    @JsonProperty("tactics")
    private List<LeaderboardEntry> tacticsLeaderboard;
}
