package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.puzzle.DailyPuzzle
import spock.lang.*


class DailyPuzzleClientTest extends Specification {
    private DailyPuzzleClient sut

    def setup() {
        sut = new DailyPuzzleClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
    }

    def "Get today's daily puzzle"() {
        when:
        DailyPuzzle result = sut.getTodaysDailyPuzzle()

        then:
        noExceptionThrown()
        result
    }

    def "Get random daily puzzle"() {
        when:
        DailyPuzzle result = sut.getRandomDailyPuzzle()

        then:
        noExceptionThrown()
        result
    }
}
