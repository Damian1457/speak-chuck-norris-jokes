package pl.wasik.damian.java.speakjokes.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.wasik.damian.java.speakjokes.api.ChuckNorrisJokesApiResponse;
import pl.wasik.damian.java.speakjokes.service.ChuckNorrisJokesService;

class ChuckNorrisJokesControllerTest {

    @Test
    void randomJoke() {
        //Given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService();
        ChuckNorrisJokesController chuckNorrisJokesController = new ChuckNorrisJokesController(chuckNorrisJokesService);

        //When
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();

        //Then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }
}