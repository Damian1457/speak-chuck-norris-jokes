package pl.wasik.damian.java.speakjokes.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.wasik.damian.java.speakjokes.service.AudioPlayService;
import pl.wasik.damian.java.speakjokes.service.VoiceRssService;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class VoiceRssControllerTest {

    @Test
    void play() throws IOException {
        //Given
        AudioPlayService audioPlayService = new AudioPlayService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);
        VoiceRssController voiceRssController = new VoiceRssController(voiceRssService);

        //When
        boolean played = voiceRssController.play("Hello?");

        //Then
        Assertions.assertTrue(played, "in not played");
    }
}