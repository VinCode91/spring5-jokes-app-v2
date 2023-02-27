package guru.springframework.spring5jokesappv2.controllers;

import guru.springframework.spring5jokesappv2.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JokeController {
    private final JokeService service;

    public JokeController(JokeService service) {
        this.service = service;
    }

    @RequestMapping("/norris")
    public String getJoke(Model model) {
        String joke = service.getRandomQuote();
        System.out.println(joke);
        model.addAttribute("joke", joke);
        return "index";
    }
}
