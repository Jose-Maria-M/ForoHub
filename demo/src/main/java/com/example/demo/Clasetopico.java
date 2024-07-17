package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDateTime;
@Entity
public class Clasetopico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory")
    private String title;

    @NotBlank(message = "Message is mandatory")
    private String message;

    @NotBlank(message = "Author is mandatory")
    private String author;

    @NotBlank(message = "Course is mandatory")
    private String course;

    private LocalDateTime createdAt = LocalDateTime.now();

    // Getters and Setters (omitted for brevity)

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
