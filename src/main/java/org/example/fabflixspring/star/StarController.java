package org.example.fabflixspring.star;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/stars")
public class StarController {
    private final StarService starService;

    public StarController(StarService starRepository) {
        this.starService = starRepository;
    }

    @GetMapping
    public ResponseEntity<List<StarDTO>> getAllStars(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "100") int size
    ) {
        return new ResponseEntity<>(starService.getAllStars(page, size), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StarDTO> getStarById(@PathVariable String id) {
        return new ResponseEntity<>(starService.getStarById(id), HttpStatus.OK);
    }

//    @PostMapping("/add")
//    public ResponseEntity<StarDTO> addStar(@RequestBody Star star) {
//        return new ResponseEntity<>(starService.addStar(star), HttpStatus.CREATED);
//    }
}
