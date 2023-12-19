package pl.wasik.damian.java.speakjokes.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

class VoiceRssServiceTest {

    @Test
    void speakJoke() throws IOException {
        //Given
        AudioPlayService audioPlayService = new AudioPlayService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);

        //When
        boolean spoken = voiceRssService.speakJoke("Hello Java!");

        //Then
        Assertions.assertTrue(spoken, "not spoken");
    }
}