package pl.wasik.damian.java.speakjokes;

import pl.wasik.damian.java.speakjokes.controller.VoiceRssController;
import pl.wasik.damian.java.speakjokes.service.AudioPlayService;
import pl.wasik.damian.java.speakjokes.service.VoiceRssService;

import java.io.IOException;

public class VoiceRssApplication {
    public static void main(String[] args) throws IOException {
        AudioPlayService audioPlayService = new AudioPlayService();
        VoiceRssService voiceRssService = new VoiceRssService(audioPlayService);
        VoiceRssController voiceRssController = new VoiceRssController(voiceRssService);


        boolean played = voiceRssController.play("");
    }
}
