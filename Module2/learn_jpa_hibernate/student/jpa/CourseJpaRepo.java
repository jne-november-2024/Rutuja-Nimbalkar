package com.think.springboot.learn_jpa_hibernate.student.jpa;

import com.think.springboot.learn_jpa_hibernate.student.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepo {

    @PersistenceContext
    private EntityManager manager;

    @Transactional
    public void get(Course c){
       try {
           manager.merge(c);
           System.out.println("Get Successfully");
       }catch (Exception e){
           System.out.println("Error: "+ e.getMessage());
       }
    }

   // @Transactional(readOnly = true) // Override to optimize for read-only
    public Course findById(long id){
        return manager.find(Course.class,id);
    }


    public void deleteById(long id){
        Course course=manager.find(Course.class,id);
        manager.remove(course);
    }



}
