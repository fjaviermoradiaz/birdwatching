# BirdWatching Application

This api has been implemented with following frameworks and tools:
  - Java 8
  - Spring Boot 1.5.19.RELEASE
  - Gradle
  - Swagger 2.7.0
  - H2 Database in Memory

# Launch application!
For launch application you can run: 
```sh
$ gradle birdwatching-api:build
$ java -jar birdwatching-api/build/libs/birdwatching-api-1.0.0-SNAPSHOT.jar
```

or you can run docker image:

```sh
$ docker pull fjaviermoradiaz/birdwatching:latest
$ docker run -p 8080:8080 fjaviermoradiaz/birdwatching:latest
```

You can access to database console in http://localhost:8080/console/
And access to swagger (API Documentation and test) http://localhost:8080/swagger-ui.html
