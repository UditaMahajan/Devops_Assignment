package com.SpringRest.SpringRest.Service;

import com.SpringRest.SpringRest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    List<Course>list;

    public CourseServiceImpl() {
        list=new ArrayList<>();
        list.add(new Course("English",1,"English Course"));
        list.add(new Course("Maths",2,"Maths Course"));
        list.add(new Course("Science",3,"Science Course"));
        list.add(new Course("Social studies",4,"Social studies course"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long id) {
        Course c=null;
        for(Course course:list)
        {
            if(course.getId()==id)
            {
                c=course;
            }
        }
        return c;
    }


}
