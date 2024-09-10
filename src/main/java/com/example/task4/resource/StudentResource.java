package com.example.task4.resource;

import com.example.task4.persistence.Student;
import com.example.task4.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentResource {
    StudentService studentService;

    public StudentResource(StudentService studentService){
        this.studentService=studentService;
    }
    @GetMapping(value = "/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping(value = "/students/{studentId}")
    public Student getStudentById(@PathVariable Long studentId){
        return studentService.getStudentById(studentId);
    }

    @PostMapping(value="/students")
    public Student registerStudent(Student student){
        return this.studentService.addStudent(student);
    }



}
