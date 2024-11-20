package com.think.springboot.learn_jpa_hibernate.student.springdatajpa;

import com.think.springboot.learn_jpa_hibernate.student.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataRepo extends JpaRepository<Course,Long> {

    List<Course> findByAuthor(String author);

    List<Course> findByName(String name);
}
