package com.example.task4.resource;

import com.example.task4.persistence.Course;
import com.example.task4.service.CourseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseResource {

    CourseService courseService;
    public CourseResource(CourseService courseService){
        this.courseService=courseService;
    }
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }
    @GetMapping("/courses/{studentId}")
    public List<Course>getCoursesByStudentId(@PathVariable Long studentId){
        return courseService.getCoursesByStudentID(studentId);
    }
}
