package org.example.fabflixspring.movie;

import java.util.Map;

public class MovieDTO {
    private String id;
    private String title;
    private Integer year;
    private String director;
    private Double rating;
    private Integer numVotes;
    private Map<String, String> stars;
    private Map<Integer, String> genres;

    public MovieDTO() {}

    public MovieDTO(String id, String title, Integer year, String director,
                    Double rating, Integer numVotes, Map<String, String> stars, Map<Integer, String> genres) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.numVotes = numVotes;
        this.stars = stars;
        this.genres = genres;
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

    public Map<String, String> getStars() {
        return stars;
    }

    public void setStars(Map<String, String> stars) {
        this.stars = stars;
    }

    public Map<Integer, String> getGenres() {
        return genres;
    }

    public void setGenres(Map<Integer, String> genres) {
        this.genres = genres;
    }
}
