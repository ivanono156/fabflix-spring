package org.example.fabflixspring.movie;

import java.util.List;

public class MovieDTO {
    private String id;
    private String title;
    private Integer year;
    private String director;
    private Double rating;
    private Integer numVotes;
    private List<StarDTO> stars;
    private List<GenreDTO> genres;

    public MovieDTO() {}

    public MovieDTO(String id, String title, Integer year, String director,
                    Double rating, Integer numVotes, List<StarDTO> stars, List<GenreDTO> genres) {
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

    public List<StarDTO> getStars() {
        return stars;
    }

    public void setStars(List<StarDTO> stars) {
        this.stars = stars;
    }

    public List<GenreDTO> getGenres() {
        return genres;
    }

    public void setGenres(List<GenreDTO> genres) {
        this.genres = genres;
    }
}
