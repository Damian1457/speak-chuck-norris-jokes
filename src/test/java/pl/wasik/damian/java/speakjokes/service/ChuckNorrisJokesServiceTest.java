package pl.wasik.damian.java.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.wasik.damian.java.speakjokes.api.ChuckNorrisJokesApiResponse;

import java.io.IOException;

class ChuckNorrisJokesServiceTest {

    @Test
    void getResponse() throws IOException {
        //Given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);
        String url = "https://api.chucknorris.io/jokes/random";

        //When
        String response = chuckNorrisJokesService.getResponse(url);

        //Then
        Assertions.assertNotNull(response, "response is NULL");
    }

    @Test
    void convert() {
        //Given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);

        //When
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.convert("{\n" +
                "\"icon_url\" : \"https://assets.chucknorris.host/img/avatar/chuck-norris.png\",\n" +
                "\"id\" : \"nl7wJ4kaSHqjLxo1tm5GmA\",\n" +
                "\"url\" : \"\",\n" +
                "\"value\" : \"When Chuck Norris breaks wind, it stays broken.\"\n" +
                "}"
        );

        //Then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");

    }

    @Test
    void randomJoke() {
        //Given
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService(null);

        //When
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesService.randomJoke();

        //Then
        Assertions.assertNotNull(chuckNorrisJokesApiResponse, "response is NULL");
    }
}