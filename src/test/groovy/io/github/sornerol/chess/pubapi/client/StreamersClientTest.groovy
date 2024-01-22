package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.streamers.StreamersList
import spock.lang.Specification

class StreamersClientTest extends Specification {
    private StreamersClient sut

    def setup() {
        sut = new StreamersClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
    }

    def "Get streamers"() {
        when:
        StreamersList result = sut.getStreamers()

        then:
        noExceptionThrown()
        result
    }
}
