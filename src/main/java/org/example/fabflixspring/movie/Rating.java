package org.example.fabflixspring.movie;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record Rating(
        @NotNull
        Double rating,
        @NotNull
        @Positive
        Integer numVotes
) {
}
