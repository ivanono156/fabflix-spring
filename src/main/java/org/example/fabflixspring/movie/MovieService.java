package org.example.fabflixspring.movie;

import org.example.fabflixspring.star.Star;
import org.example.fabflixspring.star.StarRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    private final MovieRepository movieRepository;
    private final StarRepository starRepository;

    MovieService(MovieRepository movieRepository, StarRepository starRepository) {
        this.movieRepository = movieRepository;
        this.starRepository = starRepository;
    }

    public List<MovieDTO> getAllMovies(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Movie> moviePage = movieRepository.findAll(pageable);

        return moviePage.getContent().stream()
                .map(MovieService::convertToDTO)
                .toList();
    }

    public MovieDTO getMovieById(String id) {
        return convertToDTO(movieRepository.findById(id).orElseThrow(() -> new MovieNotFoundException(id)));
    }

    public MovieDTO addMovie(Movie movie) {
        return convertToDTO(movieRepository.save(movie));
    }

    public Movie addStarsToMovie(String movieId, List<String> starIds) {
        Movie movie = movieRepository.findById(movieId).orElseThrow(() -> new MovieNotFoundException(movieId));
        List<Star> stars = starRepository.findAllById(starIds);
        movie.getStars().addAll(stars);
        return movieRepository.save(movie);
    }

    public static MovieDTO convertToDTO(Movie movie) {
        Rating rating = movie.getRating();
        return new MovieDTO(
                movie.getId(),
                movie.getTitle(),
                movie.getYear(),
                movie.getDirector(),
                rating != null ? rating.getRating() : 0.0,
                rating != null ? rating.getNumVotes() : 0,
                movie.getStars().stream().collect(Collectors.toMap(Star::getId, Star::getName)),
                movie.getGenres().stream().collect(Collectors.toMap(Genre::getId, Genre::getName))
        );
    }
}
