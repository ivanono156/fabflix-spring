package org.example.fabflixspring.movie;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public record Movie(
        @Id
        @NotBlank
        String id,
        @NotBlank
        String title,
        @NotEmpty
        Integer year,
        @NotNull
        String director,
        Rating rating
) {
}
