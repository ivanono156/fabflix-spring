package org.example.fabflixspring.star;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/stars")
public class StarController {
    private final StarRepository starRepository;

    public StarController(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    @GetMapping
    public List<Star> findAll() {
        return starRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Star> findById(@PathVariable String id) {
        return starRepository.findById(id);
    }
}
