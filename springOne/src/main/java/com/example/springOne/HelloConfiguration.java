package com.example.springOne;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record  Person(String name,int age){};
record  Address(String place,int pin){};
@Configuration
public class HelloConfiguration {



    @Bean
    public String name(){
        return "Rutuja";
    }

    @Bean
    public int age(){
        return 15;
    }
// create get set tostring constructor auto
    @Bean
    public Person person(){
        return new Person("Rutuja",20);
    }

    @Bean(name = "address2")
    public Address address(){
        return new Address("Pune",12344);
    }

//relation
    @Bean
    public Person personMethod(){
        return new Person(name(),age());
    }





}
