package com.example.task4.service;

import com.example.task4.persistence.Course;
import com.example.task4.persistence.CourseRepository;
import com.example.task4.persistence.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    CourseRepository courseRepository;
    StudentService studentService;
    public CourseService(CourseRepository courseRepository, StudentService studentService){
        this.courseRepository=courseRepository;
        this.studentService=studentService;
    }

    public List<Course>getAllCourses(){
        return this.courseRepository.findAll();
    }
    public List<Course>getCoursesByStudentID(Long studentId){
        return this.courseRepository.findByStudentStudentId(studentId);
    }
}
