package com.think.springboot.learn_jpa_hibernate.student.jpa;

import com.think.springboot.learn_jpa_hibernate.student.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLine implements CommandLineRunner {
    @Autowired
    private  CourseJpaRepo repo;
    @Override
    public void run(String... args) throws Exception {

        repo.get(new Course(1,"Java","A"));
        repo.get(new Course(2,"SB","B"));
        repo.get(new Course(3,"SB1","AB"));
        System.out.println(repo.findById(1));
        repo.deleteById(2);


    }
}
