package org.example.fabflixspring.movie;

import jakarta.persistence.*;
import org.example.fabflixspring.customer.Sale;
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

    @OneToOne(mappedBy = "movie", cascade = CascadeType.ALL)
    private Rating rating;

    @ManyToMany
    @JoinTable(
        name = "stars_in_movies",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "star_id")
    )
    private List<Star> stars;

    @ManyToMany
    @JoinTable(
        name = "genres_in_movies",
        joinColumns = @JoinColumn(name = "movie_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;

    @OneToMany(mappedBy = "movie", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Sale> sales;

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

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public List<Star> getStars() {
        return stars;
    }

    public void setStars(List<Star> stars) {
        this.stars = stars;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
