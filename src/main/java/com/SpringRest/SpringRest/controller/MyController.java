package com.SpringRest.SpringRest.controller;
import com.SpringRest.SpringRest.Service.CourseService;
import com.SpringRest.SpringRest.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/home")
    public String home(){
        return "this is home page";
    }
    @GetMapping("/courses")
    public List<Course> getCources()
    {
        int courseno=+2;
        List<Course> course=null;
        System.out.println(course.toString());
      return courseService.getCourses();

    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId)
    {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
}
