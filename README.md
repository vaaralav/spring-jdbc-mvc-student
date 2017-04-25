# spring-jdbc-mvc-student

## Requirements

- Java
- Maven

## Getting started
Run with `mvn spring-boot:run`. The app should be running at [http://localhost:8080/](http://localhost:8080).

## Caveats

- `/api/student` parses request parameters using `application/x-www-form-urlencoded` because of some Tomcat config that parses form-data only for `POST`s
