package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.match.TeamMatch
import io.github.sornerol.chess.pubapi.domain.match.TeamMatchBoard
import io.github.sornerol.chess.pubapi.test.TestConfigurationUtility
import spock.lang.Specification

class TeamMatchClientTest extends Specification {
    public static final String TEST_TEAM_MATCH_API_URL = 'https://api.chess.com/pub/match/12803'
    public static final String TEST_TEAM_MATCH_BOARD_API_URL = 'https://api.chess.com/pub/match/12803/1'
    public static final Integer TEST_DAILY_TEAM_MATCH_ID = 12803
    public static final Integer TEST_DAILY_TEAM_MATCH_BOARD_ID = 1
    public static final Integer TEST_LIVE_TEAM_MATCH_ID = 5833
    public static final Integer TEST_LIVE_TEAM_MATCH_BOARD_ID = 1
    private TeamMatchClient sut

    def setup() {
        sut = new TeamMatchClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
        sut.setFailOnUnknownProperties(TestConfigurationUtility.isOptionEnabled('checkFields'))
    }

    def "Get team match from API URL"() {
        when:
        TeamMatch result = sut.getTeamMatchFromApiUrl(TEST_TEAM_MATCH_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get daily team match by ID"() {
        when:
        TeamMatch result = sut.getDailyTeamMatchById(TEST_DAILY_TEAM_MATCH_ID)

        then:
        noExceptionThrown()
        result
    }

    def "Get live team match by ID"() {
        when:
        TeamMatch result = sut.getLiveTeamMatchById(TEST_LIVE_TEAM_MATCH_ID)

        then:
        noExceptionThrown()
        result
    }

    def "Get team match board from API URL"() {
        when:
        TeamMatchBoard result = sut.getTeamMatchBoardFromApiUrl(TEST_TEAM_MATCH_BOARD_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get daily team match board"() {
        when:
        TeamMatchBoard result = sut.getDailyTeamMatchBoard(TEST_DAILY_TEAM_MATCH_ID, TEST_DAILY_TEAM_MATCH_BOARD_ID)

        then:
        noExceptionThrown()
        result
    }

    def "Get live team match board"() {
        when:
        TeamMatchBoard result = sut.getLiveTeamMatchBoard(TEST_LIVE_TEAM_MATCH_ID, TEST_LIVE_TEAM_MATCH_BOARD_ID)

        then:
        noExceptionThrown()
        result
    }
}
