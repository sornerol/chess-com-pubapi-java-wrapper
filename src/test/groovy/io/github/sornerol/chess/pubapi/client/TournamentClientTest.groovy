package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.tournament.Tournament
import io.github.sornerol.chess.pubapi.domain.tournament.TournamentRound
import io.github.sornerol.chess.pubapi.domain.tournament.TournamentRoundGroup
import io.github.sornerol.chess.pubapi.test.TestConfigurationUtility
import spock.lang.Specification

class TournamentClientTest extends Specification {
    public static final String TEST_TOURNAMENT_API_URL = 'https://api.chess.com/pub/tournament/-33rd-chesscom-quick-knockouts-1401-1600'
    public static final String TEST_TOURNAMENT_ROUND_API_URL = 'https://api.chess.com/pub/tournament/-33rd-chesscom-quick-knockouts-1401-1600/1'
    public static final String TEST_TOURNAMENT_ROUND_GROUP_API_URL = 'https://api.chess.com/pub/tournament/-33rd-chesscom-quick-knockouts-1401-1600/1/1'
    public static final String TEST_TOURNAMENT_ID = '-33rd-chesscom-quick-knockouts-1401-1600'
    public static final Integer TEST_TOURNAMENT_ROUND = 1
    public static final Integer TEST_TOURNAMENT_GROUP = 1

    private TournamentClient sut

    def setup() {
        sut = new TournamentClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
        sut.setFailOnUnknownProperties(TestConfigurationUtility.isOptionEnabled('checkFields'))
    }

    def "Get tournament from API URL"() {
        when:
        Tournament result = sut.getTournamentFromApiUrl(TEST_TOURNAMENT_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get tournament by URL ID"() {
        when:
        Tournament result = sut.getTournamentByUrlId(TEST_TOURNAMENT_ID)

        then:
        noExceptionThrown()
        result
    }

    def "Get tournament round"() {
        when:
        TournamentRound result = sut.getTournamentRound(TEST_TOURNAMENT_ID, TEST_TOURNAMENT_ROUND)

        then:
        noExceptionThrown()
        result
    }

    def "Get tournament round by API URL"() {
        when:
        TournamentRound result = sut.getTournamentRoundByApiUrl(TEST_TOURNAMENT_ROUND_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get tournament round group"() {
        when:
        TournamentRoundGroup result = sut.getTournamentRoundGroup(TEST_TOURNAMENT_ID, TEST_TOURNAMENT_ROUND, TEST_TOURNAMENT_GROUP)

        then:
        noExceptionThrown()
        result
    }

    def "Get tournament round group by API URL"() {
        when:
        TournamentRoundGroup result = sut.getTournamentRoundGroupByApiUrl(TEST_TOURNAMENT_ROUND_GROUP_API_URL)

        then:
        noExceptionThrown()
        result
    }
}
