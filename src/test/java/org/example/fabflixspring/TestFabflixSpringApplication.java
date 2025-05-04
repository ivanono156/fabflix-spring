package org.example.fabflixspring;

import org.springframework.boot.SpringApplication;

public class TestFabflixSpringApplication {

    public static void main(String[] args) {
        SpringApplication.from(FabflixSpringApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
