package org.example.fabflixspring.star;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.annotation.Id;

public record Star(
        @Id
        @NotNull
        String id,
        @NotNull
        String name,
        @NotNull
        Integer birthYear
) {
}
