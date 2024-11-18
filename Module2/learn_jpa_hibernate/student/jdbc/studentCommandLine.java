package com.think.springboot.learn_jpa_hibernate.student.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class studentCommandLine implements CommandLineRunner {

    @Autowired
    private  studentJdbcRepo repository;
    @Override
    public void run(String... args) throws Exception {

        repository.insert();
    }
}
