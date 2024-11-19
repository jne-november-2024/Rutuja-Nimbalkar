package com.think.springboot.learn_jpa_hibernate.student;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity   //(name = "Course_Details")
public class Course {

    @Id
    long c_id;
    @Column(name = "c_name")
    String name;
    @Column(name = "c_author")
    String author;


    public Course() {
    }

    public Course(long c_id, String name, String author) {
        this.c_id = c_id;
        this.name = name;
        this.author = author;
    }

    public long getC_id() {
        return c_id;
    }

    public void setC_id(long c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_id=" + c_id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}