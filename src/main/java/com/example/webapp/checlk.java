package com.example.webapp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class checlk implements Welcome {
    public void m(){
        System.out.println("Hello World from check ");
    }
}
