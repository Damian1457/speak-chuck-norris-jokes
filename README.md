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

## Running / Installation

To run the application, follow these steps:

1. **Open the project in IntelliJ IDEA**: Clone the repository to your computer, and then open the project in IntelliJ IDEA. You can clone the repository using the following link:

    ```
    git clone https://github.com/Damian1457/speak-chuck-norris-jokes.git
    ```

2. **Find the `SpeakChuckNorrisJokesApplication.java` file**: This file contains the main class of the application annotated with `@SpringBootApplication`. You can find it in the `src/main/java/pl/wasik/damian/java/speakjokes` directory. Right-click on the `SpeakChuckNorrisJokesApplication.java` file, and then select "Run 'SpeakChuckNorrisJokesApplication'".

3. **Open the local host in your browser**: After running the application, open your web browser and enter the following URL:

    ```
    http://localhost:8080/jokes
    ```

   This will display the Chuck Norris jokes page in the application. You can click on the "Random Joke" button to display a random joke.

After completing these steps, the application should be running in IntelliJ IDEA, and the Chuck Norris jokes page will be available at `http://localhost:8080/jokes`. Clicking on the "Random Joke" button will display a random joke. If you encounter any errors, make sure your environment is properly configured and all dependencies are downloaded and installed.

## Configuration

Before running the application, you need to configure the H2 database.

## Testing

Unit tests are available in the `src/test/java`.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

This application utilizes Chuck Norris API to fetch Chuck Norris jokes. Visit their website [https://api.chucknorris.io](https://api.chucknorris.io) for more information.
