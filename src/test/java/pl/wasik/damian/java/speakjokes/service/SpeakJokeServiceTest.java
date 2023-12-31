package pl.wasik.damian.java.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class SpeakJokeServiceTest {

    @Test
    void speakJoke() throws IOException {
        //Given
        AudioPlayService audioPlayService = new AudioPlayService();
        ChuckNorrisJokesService chuckNorrisJokesService = new ChuckNorrisJokesService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);
        SpeakJokeService speakeJokeService = new SpeakJokeService(chuckNorrisJokesService, voiceRssService);

        //When
        boolean spoken = speakeJokeService.speakJoke();

        //Then
        Assertions.assertTrue(spoken, "joke not spoken");
    }
}