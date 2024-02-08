# speak-chuck-norris-jokes

## Description

"Speak Chuck Norris Jokes" is an innovative Java application that provides unforgettable experiences to users by delivering the freshest and funniest jokes about the legendary Chuck Norris. Utilizing advanced technology, the application automatically fetches the latest jokes from an external Chuck Norris API and reads them aloud, ensuring users a constant smile on their faces. The implementation is based on the efficient Spring Boot framework, guaranteeing the stability, scalability, and flexibility of the application. "Speak Chuck Norris Jokes" is more than just an application - it is an interactive adventure that immerses users in the world of humor and entertainment.

## Technologies/Versions

- Java: 17
- Spring Boot: 3.2.1
- Apache HttpClient: 4.5.13
- FreeTTS: 1.2.4
- H2 Database: 2.2.224
- Thymeleaf: 3.0.12.RELEASE
- JUnit 5: 5.10.1
- OkHttp: 4.10.0
- Jackson Core: 2.16.0
- Gson: 2.10.1
- Git
- Maven

## Additional Features

- Utilizes the latest Java technologies and the Spring Boot platform.
- Automatically generates and updates the database structure using Hibernate.
- Supports unit testing using the JUnit 5 framework.
- Provides an intuitive user interface based on Thymeleaf templates.
- Fully customizable application configuration through the `application.properties` file.
- Integration with the Chuck Norris API, allowing access to a wide range of Chuck Norris jokes in real-time.

## Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/Damian1457/speak-chuck-norris-jokes.git
    ```

2. Compile and run the application using Maven:

    ```bash
    mvn spring-boot:run
    ```

3. Open your browser and navigate to `http://localhost:8080` to see the application in action.

## Configuration

In the `src/main/resources/application.properties` file, you'll find the application configuration:

```properties
spring.jpa.generate-ddl=true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:~/speak-jokes
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true
```

## Configuration

You can customize these parameters according to your needs. For example, you can change the database name (`speak-jokes`) or the database access password (`spring.datasource.password`).

## Testing

Unit tests are available in the `src/test/java` directory and can be run using Maven:

```bash
mvn test
```
## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

This application utilizes Chuck Norris API to fetch Chuck Norris jokes. Visit their website [https://api.chucknorris.io](https://api.chucknorris.io) for more information.