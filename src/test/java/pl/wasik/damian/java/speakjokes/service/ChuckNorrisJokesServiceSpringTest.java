package pl.wasik.damian.java.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.wasik.damian.java.speakjokes.api.ChuckNorrisJokesApiResponse;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChuckNorrisJokesServiceSpringTest {

    @Autowired
    private ChuckNorrisJokesService chuckNorrisJokesService;

    @Test
    void randomJoke() {
        //Given
        // ... NOTE: injected by Spring using @Autowired

        //When
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();

        //Then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }

    @Test
    void getResponse() throws IOException {
        //Given
        // ... NOTE: injected by Spring using @Autowired
        String url = "https://api.chucknorris.io/jokes/random";

        //When
        String response = chuckNorrisJokesService.getResponse(url);

        //Then
        Assertions.assertNotNull(response, "response is NULL");
    }
}