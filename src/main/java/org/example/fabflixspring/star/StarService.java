package org.example.fabflixspring.star;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class StarService {

    private final StarRepository starRepository;

    public StarService(StarRepository starRepository) {
        this.starRepository = starRepository;
    }

    public List<StarDTO> getAllStars(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Star> starPage = starRepository.findAll(pageable);

        return starPage.getContent().stream()
                .map(StarService::convertToDTO)
                .collect(Collectors.toList());
    }

    public StarDTO getStarById(String id) {
        return convertToDTO(starRepository.findById(id).orElseThrow(RuntimeException::new));
    }

    public StarDTO addStar(Star star) {
        return convertToDTO(starRepository.save(star));
    }

    public static StarDTO convertToDTO(Star star) {
        return new StarDTO(
                star.getId(),
                star.getName(),
                star.getBirthYear(),
                star.getMovies().stream().map(movie -> new MovieDTO(movie.getId(), movie.getTitle(), movie.getYear(), movie.getDirector())).toList()
        );
    }
}
