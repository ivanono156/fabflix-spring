package org.example.fabflixspring.movie;

import jakarta.persistence.*;

@Entity
@Table(name = "ratings")
public class Rating {
    @Id
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "movie_id", referencedColumnName = "id")
    private Movie movie;

    @Column(nullable = false)
    private Double rating;

    @Column(nullable = false)
    private Integer numVotes;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
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
}
