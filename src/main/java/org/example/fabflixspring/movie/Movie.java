package org.example.fabflixspring.movie;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public record Movie(
        @Id
        @NotNull
        String id,
        @NotNull
        String title,
        @NotNull
        Integer year,
        @NotNull
        String director
) {
}
