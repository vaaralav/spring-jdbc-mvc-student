# spring-jdbc-mvc-student

## Requirements

- Java
- Maven
- MySQL

## Getting started

### Config
First create a copy or rename `application.properties`. For example:

```bash
cp src/main/resources/application.properties.example src/main/resources/application.properties
```

Fill in `spring.datasource.url`,`spring.datasource.username` and `spring.datasource.password` for your database.

### Run locally
Run with `mvn spring-boot:run`. The app should be running at [http://localhost:8080/](http://localhost:8080).

### Standalone application

Package and run the application:

```bash
mvn package
java -jar target/student-0.1.0-SNAPSHOT.war
```

Notice, that the .war-file can be distributed standalone and run with Java.


## Database
```mysql
CREATE TABLE `Student`(
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(256),  `gpax` double,
  `ambition` varchar(256),
  PRIMARY KEY (id)
);
```


## TODO

- API response statuses (`201 Created`, `404 Not Found`...).
- Use some partials for view to DRY (=Don't Repeat Yourself) the views

## References

### [Spring Boot Guides](https://spring.io/guides)

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Accessing Relational Data using JDBC with Spring](https://spring.io/guides/gs/relational-data-access/)

### Spring Boot Sample projects

- [spring-boot-sample-web-jsp](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-web-jsp)
- [spring-boot-web-static](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-samples/spring-boot-sample-web-static)

### YouTube videos

- Iam Djalas: [Learn Spring Boot (MVC) in 50 Minutes](https://www.youtube.com/watch?v=Ke7Tr4RgRTs)


### [Spring Framework Reference](http://docs.spring.io/spring/docs/2.5.x/reference/)

### [Spring Boot - Hello World Standalone Application](http://mnkartik.github.io/spring-boot/spring-boot-hello-world-standalone-application)
