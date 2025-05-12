package org.example.fabflixspring.movie;

public class MovieNotFoundException extends RuntimeException {
    public MovieNotFoundException(String movieId) {
        super("Movie with id '" + movieId + "' not found");
    }
}
