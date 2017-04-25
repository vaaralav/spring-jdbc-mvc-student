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
- Serve HTML using Jasper template.
- WIP: Implement JdbcTemplate as DAO.
