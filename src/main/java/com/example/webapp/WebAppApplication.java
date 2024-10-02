package com.example.webapp;


import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class WebAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebAppApplication.class, args);
        //ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       //  Hello obj =(Hello) context.getBean("hello");




    }

}
