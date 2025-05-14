package org.example.fabflixspring.movie;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface MovieRepository extends JpaRepository<Movie, String> {
    @Query("SELECT m FROM Movie m JOIN m.genres g on g.id = :genreId")
    Page<Movie> findByGenreId(@Param("genreId") Integer genreId, Pageable pageable);
}
