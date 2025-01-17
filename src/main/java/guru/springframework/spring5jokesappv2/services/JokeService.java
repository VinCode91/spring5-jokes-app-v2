package guru.springframework.spring5jokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    public String getRandomQuote() {
        return (new ChuckNorrisQuotes()).getRandomQuote();
    }
}
