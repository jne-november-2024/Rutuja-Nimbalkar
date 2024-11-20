package com.think.springboot.learn_jpa_hibernate.student.springdatajpa;

import com.think.springboot.learn_jpa_hibernate.student.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CourseDataJpaCmd  implements CommandLineRunner {

    @Autowired
    private CourseSpringDataRepo repo;


    @Override
    public void run(String... args) throws Exception {

        repo.save(new Course(4,"Micro","X"));
        repo.save(new Course(5,"Micro1","X"));

        System.out.println(repo.findById(4l));
        repo.deleteById(5l);

        List<Course> list= repo.findAll();
        list.stream().forEach(System.out::println);

        System.out.println(repo.findAll());
        System.out.println(repo.count());

        System.out.println(repo.findByAuthor("X"));
        System.out.println(repo.findByAuthor(""));


        System.out.println(repo.findByName("Java"));
        System.out.println(repo.findByName("SB1"));
        System.out.println(repo.findByName("S1")+"-------------------------------");


    }
}
