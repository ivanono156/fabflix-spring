package org.example.fabflixspring.movie;

import org.example.fabflixspring.star.Star;
import org.example.fabflixspring.star.StarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    private final StarRepository starRepository;

    MovieService(MovieRepository movieRepository, StarRepository starRepository) {
        this.movieRepository = movieRepository;
        this.starRepository = starRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(String id) {
        return movieRepository.findById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie addStarsToMovie(String movieId, List<String> starIds) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new MovieNotFoundException(movieId));
        List<Star> stars = starRepository.findAllById(starIds);
        movie.getStars().addAll(stars);
        return movieRepository.save(movie);
    }
}
