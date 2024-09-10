package com.example.task4.persistence;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long courseId;


    private String courseName;

    @ManyToOne
    @JoinColumn(name = "studentNo") // This should match the column in the Student entity
    private Student student;
}
