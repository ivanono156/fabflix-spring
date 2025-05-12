package org.example.fabflixspring.movie;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, String> {
    Page<Movie> findAll(Pageable pageable);
}
