package org.example.fabflixspring.star;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StarService {

    private final StarRepository starRepository;

    public StarService(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public List<Star> getAllStars() {
        return starRepository.findAll();
    }

    public Optional<Star> getStarById(String id) {
        return starRepository.findById(id);
    }

    public Star addStar(Star star) {
        return starRepository.save(star);
    }
}
