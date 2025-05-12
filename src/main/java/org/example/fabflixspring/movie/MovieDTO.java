package org.example.fabflixspring.movie;

import java.util.List;

public class MovieDTO {
    private String id;
    private String title;
    private Integer year;
    private String director;
    private Double rating;
    private Integer numVotes;
    private List<String> starNames;
    private List<String> genreNames;

    public MovieDTO() {}

    public MovieDTO(String id, String title, Integer year, String director,
                    Double rating, Integer numVotes, List<String> starNames, List<String> genreNames) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.numVotes = numVotes;
        this.starNames = starNames;
        this.genreNames = genreNames;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getNumVotes() {
        return numVotes;
    }

    public void setNumVotes(Integer numVotes) {
        this.numVotes = numVotes;
    }

    public List<String> getStarNames() {
        return starNames;
    }

    public void setStarNames(List<String> starNames) {
        this.starNames = starNames;
    }

    public List<String> getGenreNames() {
        return genreNames;
    }

    public void setGenreNames(List<String> genreNames) {
        this.genreNames = genreNames;
    }
}
