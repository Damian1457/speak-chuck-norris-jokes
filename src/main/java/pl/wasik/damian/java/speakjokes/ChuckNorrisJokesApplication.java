package pl.wasik.damian.java.speakjokes;

import pl.wasik.damian.java.speakjokes.api.ChuckNorrisJokesApiResponse;
import pl.wasik.damian.java.speakjokes.controller.ChuckNorrisJokesController;
import pl.wasik.damian.java.speakjokes.service.ChuckNorrisJokesService;

public class ChuckNorrisJokesApplication {
    public static void main(String[] args) {
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService();
        ChuckNorrisJokesController chuckNorrisJokesController = new ChuckNorrisJokesController(chuckNorrisJokesService);

        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = chuckNorrisJokesController.randomJoke();
        String joke = chuckNorrisJokesApiResponse.getValue();
    }
}
