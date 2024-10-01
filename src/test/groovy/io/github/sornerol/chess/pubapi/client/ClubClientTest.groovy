package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.club.Club
import io.github.sornerol.chess.pubapi.domain.club.ClubMembers
import io.github.sornerol.chess.pubapi.domain.club.match.ClubMatches
import io.github.sornerol.chess.pubapi.test.TestConfigurationUtility
import spock.lang.Specification


class ClubClientTest extends Specification {
    public static final String TEST_CLUB_ID = 'chess-com-daily-chess-club'
    public static final String TEST_CLUB_API_URL = 'https://api.chess.com/pub/club/chess-com-daily-chess-club'
    private ClubClient sut

    def setup() {
        sut = new ClubClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
        sut.setFailOnUnknownProperties(TestConfigurationUtility.isOptionEnabled('checkFields'))
    }

    def "Get club by API URL"() {
        when:
        Club result = sut.getClubFromApiUrl(TEST_CLUB_API_URL)
        then:
        noExceptionThrown()
        result
    }

    def "Get club by URL ID"() {
        when:
        Club result = sut.getClubByUrlId(TEST_CLUB_ID)
        then:
        noExceptionThrown()
        result
    }

    def "Get club members"() {
        when:
        ClubMembers result = sut.getClubMembers(TEST_CLUB_ID)

        then:
        noExceptionThrown()
        result
    }

    def "Get club matches"() {
        when:
        ClubMatches result = sut.getClubMatches(TEST_CLUB_ID)

        then:
        noExceptionThrown()
        result
    }
}
