package org.example.fabflixspring.star;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/stars")
public class StarController {
    private final StarService starService;

    public StarController(StarService starRepository) {
        this.starService = starRepository;
    }

    @GetMapping
    public List<Star> getAllStars() {
        return starService.getAllStars();
    }

    @GetMapping("/{id}")
    public Optional<Star> getStarById(@PathVariable String id) {
        return starService.getStarById(id);
    }

    @PostMapping
    public ResponseEntity<Star> addStar(@RequestBody Star star) {
        return new ResponseEntity<>(starService.addStar(star), HttpStatus.CREATED);
    }
}
