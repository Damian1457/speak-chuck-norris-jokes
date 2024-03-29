package pl.wasik.damian.java.speakjokes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.wasik.damian.java.speakjokes.repository.entity.JokesEntity;

@Repository
public interface JokesRepository extends JpaRepository<JokesEntity, Long> {
}
