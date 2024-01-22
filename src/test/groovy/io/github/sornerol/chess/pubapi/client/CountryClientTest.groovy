package io.github.sornerol.chess.pubapi.client

import io.github.sornerol.chess.pubapi.domain.country.Country
import io.github.sornerol.chess.pubapi.test.TestConfigurationUtility
import spock.lang.Specification


class CountryClientTest extends Specification {
    //Using Finland (FI) because countries with larger player bases (e.g. US)
    //tend to fail when retrieving data
    public static final String TEST_ISO_CODE = 'FI'
    public static final String TEST_API_URL = 'https://api.chess.com/pub/country/FI'
    private CountryClient sut

    def setup() {
        sut = new CountryClient()
        sut.userAgent = 'chesscom-pubapi-wrapper unit tests; username: lrj825; github.com/sornerol/chess-com-pubapi-java-wrapper'
        sut.setFailOnUnknownProperties(TestConfigurationUtility.isOptionEnabled('checkFields'))
    }

    def "Get country from API URL"() {
        when:
        Country result = sut.getCountryFromApiUrl(TEST_API_URL)

        then:
        noExceptionThrown()
        result
    }

    def "Get country by ISO code"() {
        when:
        Country result = sut.getCountryByIsoCode(TEST_ISO_CODE)

        then:
        noExceptionThrown()
        result
    }

    def "Get new and active players for country"() {
        when:
        List<String> result = sut.getNewAndActivePlayersForCountry(TEST_ISO_CODE)

        then:
        noExceptionThrown()
        result
    }

    def "Get club API URLs for country"() {
        when:
        List<String> result = sut.geClubApiUrlsForCountry(TEST_ISO_CODE)

        then:
        noExceptionThrown()
        result
    }
}
