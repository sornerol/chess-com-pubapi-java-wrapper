package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.game.ArchiveApiUrlList
import io.github.sornerol.chess.pubapi.domain.game.ArchiveGameList
import io.github.sornerol.chess.pubapi.domain.game.GameList
import io.github.sornerol.chess.pubapi.domain.player.Player
import io.github.sornerol.chess.pubapi.domain.player.club.PlayerClubList
import io.github.sornerol.chess.pubapi.domain.player.enums.Title
import io.github.sornerol.chess.pubapi.domain.player.match.MatchHistory
import io.github.sornerol.chess.pubapi.domain.player.stats.PlayerStats
import io.github.sornerol.chess.pubapi.domain.player.tournament.TournamentHistory
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException
import io.github.sornerol.chess.pubapi.test.TestConfigurationUtility
import spock.lang.Ignore
import spock.lang.Specification
import spock.lang.Unroll

class PlayerClientTest extends Specification {
    public static final String TEST_PLAYER_USERNAME = 'lrj825'
    public static final String TEST_PLAYER_API_URL = 'https://api.chess.com/pub/player/lrj825'
    public static final String TEST_PLAYER_STATS_API_URL = 'https://api.chess.com/pub/player/lrj825/stats'
    public static final String TEST_PLAYER_ARCHIVE_API_URL = 'https://api.chess.com/pub/player/lrj825/games/2023/12'

    private PlayerClient sut

    def setup() {
        sut = new PlayerClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
        sut.setFailOnUnknownProperties(TestConfigurationUtility.isOptionEnabled('checkFields'))
    }

    def "Get player from API URL"() {
        when:
        Player result = sut.getPlayerFromApiUrl(TEST_PLAYER_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get player by username"() {
        when:
        Player result = sut.getPlayerByUsername(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get players with title"() {
        when:
        List<String> result = sut.getPlayersWithTitle(Title.GM)

        then:
        noExceptionThrown()
        result
    }

    def "Get stats for player"() {
        when:
        PlayerStats result = sut.getStatsForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get stats for player from API URL"() {
        when:
        PlayerStats result = sut.getStatsForPlayerFromApiUrl(TEST_PLAYER_STATS_API_URL)

        then:
        noExceptionThrown()
        result
    }

    @Ignore('This endpoint seems to be broken')
    def "Is player online"() {
        when:
        sut.isPlayerOnline(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
    }

    def "Get current daily chess games for player"() {
        when:
        GameList result = sut.getCurrentDailyChessGamesForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get to move daily chess games for player"() {
        when:
        GameList result = sut.getToMoveDailyChessGamesForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get monthly archives available for player"() {
        when:
        ArchiveApiUrlList result = sut.getMonthlyArchivesAvailableForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get monthly archive for player"() {
        when:
        ArchiveGameList result = sut.getMonthlyArchiveForPlayer(TEST_PLAYER_USERNAME, 2023, 12)

        then:
        noExceptionThrown()
        result
    }

    @Unroll
    def "Get monthly archive for player - invalid inputs"(Integer month) {
        when:
        sut.getMonthlyArchiveForPlayer(TEST_PLAYER_USERNAME, 2023, month)

        then:
        thrown(ChessComPubApiException)

        where:
        month   | _
        0       | _
        13      | _
    }

    def "Get monthly archive for player from API URL"() {
        when:
        ArchiveGameList result = sut.getMonthlyArchiveForPlayerFromApiUrl(TEST_PLAYER_ARCHIVE_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get monthly archive for player as PGN"() {
        when:
        String result = sut.getMonthlyArchiveForPlayerAsPgn(TEST_PLAYER_USERNAME, 2023, 12)

        then:
        noExceptionThrown()
        result
    }

    @Unroll
    def "Get monthly archive for player as PGN - invalid inputs"(Integer month) {
        when:
        sut.getMonthlyArchiveForPlayerAsPgn(TEST_PLAYER_USERNAME, 2023, month)

        then:
        thrown(ChessComPubApiException)

        where:
        month   | _
        0       | _
        13      | _
    }

    def "Get clubs for player"() {
        when:
        PlayerClubList result = sut.getClubsForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get team matches for player"() {
        when:
        MatchHistory result = sut.getTeamMatchesForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }

    def "Get tournaments for player"() {
        when:
        TournamentHistory result = sut.getTournamentsForPlayer(TEST_PLAYER_USERNAME)

        then:
        noExceptionThrown()
        result
    }
}
