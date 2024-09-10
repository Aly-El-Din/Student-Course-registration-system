package com.example.task4.service;

import com.example.task4.persistence.Student;
import com.example.task4.persistence.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }

    public List<Student>getAllStudents(){
        return this.studentRepository.findAll();
    }

    public Student getStudentById(Long studentId){
        return this.studentRepository.findById(studentId).get();
    }

    public Student addStudent(Student student){
        return this.studentRepository.save(student);
    }
}
