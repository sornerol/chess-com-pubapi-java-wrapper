package io.github.sornerol.chess.pubapi.domain.leaderboards;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * Wrapper class that stores a {@link LeaderboardEntry} list to represent the leaderboard for each category.
 */
@ToString
@Getter
@Setter
public class Leaderboards {
    /**
     * Daily chess leaderboard
     */
    @JsonProperty("daily")
    private List<LeaderboardEntry> dailyLeaderboard;

    /**
     * Daily chess960 leaderboard
     */
    @JsonProperty("daily960")
    private List<LeaderboardEntry> daily960Leaderboard;

    /**
     * Live rapid leaderboard
     */
    @JsonProperty("live_rapid")
    private List<LeaderboardEntry> liveRapidLeaderboard;

    /**
     * Live blitz leaderboard
     */
    @JsonProperty("live_blitz")
    private List<LeaderboardEntry> liveBlitzLeaderboard;

    /**
     * Live bullet leaderboard
     */
    @JsonProperty("live_bullet")
    private List<LeaderboardEntry> liveBulletLeaderboard;

    /**
     * Live bughouse leaderboard
     */
    @JsonProperty("live_bughouse")
    private List<LeaderboardEntry> liveBughouseLeaderboard;

    /**
     * Live blitz chess960 leaderboard
     */
    @JsonProperty("live_blitz960")
    private List<LeaderboardEntry> liveBlitz960Leaderboard;

    /**
     * Live three-check leaderboard
     */
    @JsonProperty("live_threecheck")
    private List<LeaderboardEntry> liveThreeCheckLeaderboard;

    /**
     * Live crazyhouse leaderboard
     */
    @JsonProperty("live_crazyhouse")
    private List<LeaderboardEntry> liveCrazyhouseLeaderboard;

    /**
     * Live king of the hill leaderboard
     */
    @JsonProperty("live_kingofthehill")
    private List<LeaderboardEntry> liveKingOfTheHillLeaderboard;

    /**
     * Tactics leaderboard
     */
    @JsonProperty("tactics")
    private List<LeaderboardEntry> tacticsLeaderboard;

    /**
     * Puzzle Rush leaderboard
     */
    @JsonProperty("rush")
    private List<LeaderboardEntry> rushLeaderboard;

    /**
     * Puzzle Battle leaderboard
     */
    @JsonProperty("Battle")
    private List<LeaderboardEntry> battleLeaderboard;
}
