package pl.wasik.damian.java.speakjokes.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JOKES")
public class JokesEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String jokes;

    public JokesEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJokes() {
        return jokes;
    }

    public void setJokes(String jokes) {
        this.jokes = jokes;
    }

    @Override
    public String toString() {
        return "JokesEntity{" +
                "id=" + id +
                ", jokes='" + jokes + '\'' +
                '}';
    }
}
