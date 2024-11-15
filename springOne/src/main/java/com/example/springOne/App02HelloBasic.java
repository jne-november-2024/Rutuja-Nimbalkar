package com.example.springOne;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloBasic {
    public static void main(String[] args) {

        // lunching a spring context
        var context=new AnnotationConfigApplicationContext(HelloConfiguration.class);

        // Configure the things that we want manage by spring

        System.out.println(context .getBean("name")); // get by name method name

        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));


        System.out.println(context.getBean("personMethod"));





    }

}
