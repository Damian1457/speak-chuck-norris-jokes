package pl.wasik.damian.java.speakjokes.controller;

import pl.wasik.damian.java.speakjokes.service.VoiceRssService;

import java.io.IOException;
import java.util.logging.Logger;

public class VoiceRssController {
    private static final Logger LOGGER = Logger.getLogger(VoiceRssController.class.getName());

    private final VoiceRssService voiceRssService;

    public VoiceRssController(VoiceRssService voiceRssService) {
        this.voiceRssService = voiceRssService;
    }

    public boolean play(String textVoice) throws IOException {
        LOGGER.info("play(" + textVoice + ")");
        boolean spoken = voiceRssService.speakJoke(textVoice);
        LOGGER.info("play(...) = " + spoken);
        return spoken;
    }
}
