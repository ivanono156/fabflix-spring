package org.example.fabflixspring.movie;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
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

    public List<MovieDTO> getAllMoviesOfGenre(int page, int size, Integer genreId) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Movie> moviePage = movieRepository.findByGenreId(genreId, pageable);
        return moviePage.getContent().stream()
                .map(MovieService::convertToDTO)
                .toList();
    }


    public MovieDTO addMovie(Movie movie) {
        return convertToDTO(movieRepository.save(movie));
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
                movie.getStars().stream().map(star -> new StarDTO(star.getId(), star.getName(), star.getBirthYear())).toList(),
                movie.getGenres().stream().map(genre -> new GenreDTO(genre.getId(), genre.getName())).toList()
        );
    }
}
