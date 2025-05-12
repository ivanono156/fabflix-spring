package org.example.fabflixspring.movie;

import jakarta.persistence.*;
import org.example.fabflixspring.star.Star;

import java.util.List;

@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @Column(length = 10)
    private String id;

    @Column(length = 100, nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer year;

    @Column(length = 100, nullable = false)
    private String director;

    @OneToOne(mappedBy = "movie")
    private Rating rating;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "stars_in_movies",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "star_id")
    )
    private List<Star> stars;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "genres_in_movies",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;

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

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }
}
