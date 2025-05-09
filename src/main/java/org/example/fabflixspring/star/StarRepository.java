package org.example.fabflixspring.star;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StarRepository {

    List<Star> stars = new ArrayList<>();

    @PostConstruct
    public void init() {
        stars.add(new Star("nm0000001"
                ,"Fred Astaire",
                1899));
        stars.add(new Star("nm0000008",
                "Marlon Brando",
                1924));
        stars.add(new Star("nm0000017",
                "Marlene Dietrich",
                1901));
        stars.add(new Star("nm0000018",
                "Kirk Douglas",
                1916));
        stars.add(new Star("nm0000032",
                "Charlton Heston",
                1923));
    }

    public List<Star> findAll() {
        return stars;
    }

    public Optional<Star> findById(String id) {
        return stars.stream()
                .filter(star -> star.id().equals(id))
                .findFirst();
    }
}
