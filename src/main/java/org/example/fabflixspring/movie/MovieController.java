package org.example.fabflixspring.movie;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public Optional<Movie> getMovieById(@PathVariable String id) {
        return movieService.getMovieById(id);
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie) {
        return new ResponseEntity<>(movieService.addMovie(movie), HttpStatus.CREATED);
    }

    @PostMapping("/{movieId}/stars")
    public ResponseEntity<Movie> addStarsToMovie(@PathVariable String movieId, @RequestBody List<String> starIds) {
        return new ResponseEntity<>(movieService.addStarsToMovie(movieId, starIds), HttpStatus.CREATED);
    }
}
