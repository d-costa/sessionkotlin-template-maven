# sessionkotlin-template-maven

Template of a maven-based project using sessionkotlin

## Important notice

GitHub requires authentication even for public packages.

To be able to import the library and plugin within Gradle, create a personal GitHub token
with scope `read:packages`, and create a `.env` file at the same level as this README:

```shell
USERNAME=YOUR_USERNAME
TOKEN=YOUR_PERSONAL_TOKEN
```

## Usage

```shell
mvn compile package
java -jar target/sessionkotlin-template-maven-1.0-SNAPSHOT.jar
```

The generated API will be located in `build/generated/sessionkotlin/main/kotlin`.

