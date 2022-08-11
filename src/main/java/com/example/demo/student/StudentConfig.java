package com.example.demo.student;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student xavier = new Student(
                    "Xavier",
                    LocalDate.of(2022, APRIL, 5),
                    "xavier.test@gmail.com"
            );

            Student john = new Student(
                    "john",
                    LocalDate.of(2004, APRIL, 20),
                    "john.test@gmail.com"
            );

            repository.saveAll(
                    List.of(xavier, john)
            );
        };
    }
}
