# Contribution Guidelines
Thank you for your interest in contributing to the Chess.com PubAPI Wrapper for Java. Before you get started, please review these guidelines.

## Branches
The `main` branch reflects the state of the most current release. Please submit all pull requests against the `development` branch.

## Issues 
All significant changes should be tied to an open issue. Trivial changes (e.g., correcting documentation typos) do not need an issue. When in doubt, go ahead and create a new issue before starting work. This allows for discussion around your proposed change and can prevent you from wasting time in the event your proposal doesn't align with the project's needs.

## Documentation
Please add or update Javadocs as necessary. This allows for a better experience for end users.

## Tests
If your change implements a new API endpoint, please add a unit test that verifies the new functionality. Your unit test
need not be super extensive; it's fine just to verify that the new method calls the corresponding API endpoint
and that Chess.com returns a response.

### Running tests
Before your pull request is merged, it must pass all unit tests. You can verify your changes in your local environment
by running `mvn test`. You can also verify that the API wrapper knows about all of the fields supplied in Chess.com's response
with `mvn test -DcheckFields=true`.

## License
By contributing to this project, you agree that your contributions will be licensed under its [Apache-2.0 License](https://github.com/sornerol/chess-com-pubapi-java-wrapper/blob/main/LICENSE).