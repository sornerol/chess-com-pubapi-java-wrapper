# Chess.com PubAPI Wrapper for Java
[![javadoc](https://javadoc.io/badge2/io.github.sornerol/chesscom-pubapi-wrapper/javadoc.svg)](https://javadoc.io/doc/io.github.sornerol/chesscom-pubapi-wrapper)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.sornerol/chesscom-pubapi-wrapper/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.sornerol/chesscom-pubapi-wrapper)

A Java wrapper for Chess.com's public data API (PubAPI)

# Quick Start
Follow these directions to get up-and-running with the Chess.com API wrapper.

## Add dependencies to Maven/Gradle
To get started, add `chesscom-pubapi-wrapper` to your project's dependencies.

### Maven
Add the following dependency to the dependencies section of your project's `pom.xml` file:
```
<dependencies>
    <!-- Other project dependencies -->
    <dependency>
        <groupId>io.github.sornerol</groupId>
        <artifactId>chesscom-pubapi-wrapper</artifactId>
        <version>1.4.1</version>
    </dependency>
</dependencies
```
### Gradle
Add the following dependency to the dependencies section of your project's `build.gradle` file:
```
dependencies {
    // other project dependencies...
    implementation 'io.github.sornerol:chesscom-pubapi-wrapper:1.4.1'
}
```

## Create a new client
The API wrapper consists of different clients, which correspond to different API endpoints within Chess.com's PubAPI:
- ClubClient
- CountryClient
- DailyPuzzleClient
- LeaderboardsClient
- PlayerClient
- StreamersClient
- TeamMatchClient
- TournamentClient

A complete description of these clients is available in the [Javadocs](https://javadoc.io/doc/io.github.sornerol/chesscom-pubapi-wrapper).

For our example, let's create a new PlayerClient to retrieve information about a player:
```java
import io.github.sornerol.chess.pubapi.client.PlayerClient;
import io.github.sornerol.chess.pubapi.domain.player.Player;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ChessComPubApiException, IOException {
        PlayerClient client = new PlayerClient();
        Player player = client.getPlayerByUsername("erik");

        System.out.println(player.toString());
    }
}
```

# Requesting New Fields
Chess.com adds new fields to the PubAPI from time to time. If there is a new field in the API you need access to, feel free to open an issue. I can usually have the new field added within a day or two.

# Get Involved
If you're interested in helping out, start by reviewing [CONTRIBUTING.md](https://github.com/sornerol/chess-com-pubapi-java-wrapper/blob/main/CONTRIBUTING.md). All help is appreciated!