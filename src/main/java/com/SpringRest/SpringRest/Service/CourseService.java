package com.SpringRest.SpringRest.Service;

import com.SpringRest.SpringRest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long id);
}
