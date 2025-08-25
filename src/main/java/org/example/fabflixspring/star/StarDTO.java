package org.example.fabflixspring.star;

import java.util.List;

public class StarDTO {
    private String id;
    private String name;
    private Integer birthYear;
    private List<MovieDTO> movies;

    public StarDTO() {
    }

    public StarDTO(String id, String name, Integer birthYear, List<MovieDTO> movies) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.movies = movies;
    }

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

    public List<MovieDTO> getMovies() {
        return movies;
    }

    public void setMovies(List<MovieDTO> movies) {
        this.movies = movies;
    }
}
