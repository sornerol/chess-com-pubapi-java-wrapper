package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.leaderboards.Leaderboards
import io.github.sornerol.chess.pubapi.test.TestConfigurationUtility
import spock.lang.Specification


class LeaderboardsClientTest extends Specification {
    private LeaderboardsClient sut

    def setup() {
        sut = new LeaderboardsClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
        sut.setFailOnUnknownProperties(TestConfigurationUtility.isOptionEnabled('checkFields'))
    }

    def "Get leaderboards"() {
        when:
        Leaderboards result = sut.getLeaderboards()

        then:
        noExceptionThrown()
        result
    }
}
