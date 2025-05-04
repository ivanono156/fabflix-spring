package org.example.fabflixspring.movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movies")
public class MovieController {
    private final MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("")
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movie> findById(@PathVariable String id) {
        return movieRepository.findById(id);
    }
}
