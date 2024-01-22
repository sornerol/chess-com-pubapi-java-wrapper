package io.github.sornerol.chess.pubapi.test

class TestConfigurationUtility {
    static boolean isOptionEnabled(String option) {
        try {
            Boolean.parseBoolean(System.getProperty(option, 'false'))
        } catch (ignored) {
            false
        }
    }
}
