package pl.wasik.damian.java.speakjokes.service;

import com.google.gson.Gson;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.stereotype.Service;
import pl.wasik.damian.java.speakjokes.api.ChuckNorrisJokesApiResponse;
import pl.wasik.damian.java.speakjokes.repository.JokesRepository;
import pl.wasik.damian.java.speakjokes.repository.entity.JokesEntity;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ChuckNorrisJokesService {
    private static final Logger LOGGER = Logger.getLogger(ChuckNorrisJokesService.class.getName());
    private static final String API_URL = "https://api.chucknorris.io/jokes/random";

    private final JokesRepository jokesRepository;
    private OkHttpClient client = new OkHttpClient();

    public ChuckNorrisJokesService(JokesRepository jokesRepository) {
        this.jokesRepository = jokesRepository;
    }

    public ChuckNorrisJokesApiResponse randomJoke() {
        LOGGER.info("randomJoke()");
        try {
            String responseBody = getResponse(API_URL);
            ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = convert(responseBody);
            String joke = chuckNorrisJokesApiResponse.getValue();

            JokesEntity jokeEntity = new JokesEntity();
            jokeEntity.setJokes(joke);
            JokesEntity savedJokesEntity = jokesRepository.save(jokeEntity);
            LOGGER.info("savedJokesEntity: " + savedJokesEntity);
            LOGGER.info("randomJoke(...) = " + chuckNorrisJokesApiResponse);
            return chuckNorrisJokesApiResponse;
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Unable to connect with external API.", e);
        }

        LOGGER.info("randomJoke(...) = " + null);
        return null;
    }

    public String getResponse(String url) throws IOException {
        LOGGER.info("getResponse(" + url + ")");
        Request request = new Request.Builder()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            String body = response.body().string();
            LOGGER.info("getResponse(...) = " + body);
            return body;
        }
    }

    public ChuckNorrisJokesApiResponse convert(String body) {
        LOGGER.info("convert(" + body + ")");
        Gson gson = new Gson();
        ChuckNorrisJokesApiResponse chuckNorrisJokesApiResponse = gson.fromJson(body, ChuckNorrisJokesApiResponse.class);
        LOGGER.info("convert(...) = " + chuckNorrisJokesApiResponse);
        return chuckNorrisJokesApiResponse;
    }
}
