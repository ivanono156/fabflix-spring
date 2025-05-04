package org.example.fabflixspring.movie;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MovieRepository {

    List<Movie> movies = new ArrayList<>();

    @PostConstruct
    public void init() {
        movies.add(new Movie("1", "Movie1", 1999, "Me"));
        movies.add(new Movie("2", "Movie2", 2023, "You"));
        movies.add(new Movie("3", "The Last Forcebender", 2017, "Rian Jonson"));
        System.out.println("Number of Movies: " + movies.size());
    }

    public List<Movie> findAll() {
        return movies;
    }

}
