package org.example.fabflixspring.movie;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class MovieRepository {

    List<Movie> movies = new ArrayList<>();

    @PostConstruct
    public void init() {
        movies.add(new Movie("1",
                "Movie1",
                1999,
                "Me",
                new Rating(9.5, 10)));
        movies.add(new Movie("2",
                "Movie2",
                2023,
                "You",
                new Rating(6.9, 20)));
        movies.add(new Movie("3",
                "The Last Forcebender",
                2017,
                "Rian Jonson",
                new Rating(0.5, 100)));
        movies.add(new Movie("4",
                "Sky Figthers",
                2005,
                "Gérard Pirès",
                null));
        System.out.println("Number of Movies: " + movies.size());
    }

    public List<Movie> findAll() {
        return movies;
    }

    public Optional<Movie> findById(String id) {
        return movies.stream()
                .filter(movie -> movie.id().equals(id))
                .findFirst();
    }
}
