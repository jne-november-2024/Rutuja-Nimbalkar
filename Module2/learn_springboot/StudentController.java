package com.think.sb.learn_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private  StudentConfiguration cfg;
    @RequestMapping("/students")
    public List<Student> retrive(){
        return Arrays.asList(
          new Student(1,"Rutuja","Department 1"),
                new Student(2,"John","Department 2"),
                new Student(3,"Smith","Department 3"),
                new Student(4,"Abc","Department 4"),
                new Student(5,"Carrie","Department 5")

        );
    }


    @RequestMapping("/services")
    public StudentConfiguration get(){
        return cfg;
    }
}

