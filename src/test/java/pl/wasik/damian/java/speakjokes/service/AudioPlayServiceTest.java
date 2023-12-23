package pl.wasik.damian.java.speakjokes.service;

import org.junit.jupiter.api.Test;

import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class AudioPlayServiceTest {

    @Test
    void play() {
        //Given
        AudioPlayService audioPlayService = new AudioPlayService();
        InputStream inputStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("hello.wav");

        //When
        audioPlayService.play(inputStream);

        //Then

    }
}