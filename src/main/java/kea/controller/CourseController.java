package kea.controller;

import kea.model.Course;
import kea.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.PublicKey;
import java.util.List;

@Controller
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    /*@GetMapping("/coursemenu")
    public List<Course> getAll(){
        return courseRepository.findAll();
    }*/

    @GetMapping("/courses")
    public Iterable<Course> getCourse(){
        return courseRepository.findAll();
    }
}
