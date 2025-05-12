package org.example.fabflixspring.star;

import jakarta.persistence.*;
import org.example.fabflixspring.movie.Movie;

import java.util.List;

@Entity
@Table(name = "stars")
public class Star {
    @Id
    @Column(length = 10)
    private String id;

    @Column(length = 100, nullable = false)
    private String name;

    private Integer birthYear;

    @ManyToMany(mappedBy = "stars")
    private List<Movie> movies;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
