package com.think.springboot.learn_jpa_hibernate.student.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class studentJdbcRepo {
    @Autowired
    private JdbcTemplate jb; //null if not  auto...

    private String inser_query="insert into student(id,name,dept) values(1,'Rutuja','Dept 1')";
    public void insert(){
        jb.update(inser_query);
    }



}
