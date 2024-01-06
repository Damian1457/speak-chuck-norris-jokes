package pl.wasik.damian.java.speakjokes.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.wasik.damian.java.speakjokes.api.ChuckNorrisJokesApiResponse;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChuckNorrisJokesControllerSpringTest {

    @Autowired
    private ChuckNorrisJokesController chuckNorrisJokesController;

    @Test
    void randomJoke() {
        //Given
        // ... NOTE: injection by Spring using @Autowired

        //When
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();

        //Then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }
}