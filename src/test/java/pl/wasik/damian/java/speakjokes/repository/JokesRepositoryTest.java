package pl.wasik.damian.java.speakjokes.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.wasik.damian.java.speakjokes.repository.entity.JokesEntity;

@SpringBootTest
class JokesRepositoryTest {
    @Autowired
    private JokesRepository jokesRepository;

    @Test
    void saveJoke() {
        //Given
        // ... NOTE injected by @Autowired
        JokesEntity jokeEntity = new JokesEntity();

        //When
        JokesEntity savedJokeEntity = jokesRepository.save(jokeEntity);

        //Then
        Assertions.assertAll(
                () -> Assertions.assertNotNull(savedJokeEntity, "savedJokeEntity is NULL"),
                () -> Assertions.assertNotNull(savedJokeEntity.getId(), "savedJokeEntity is NULL")
        );
    }

}