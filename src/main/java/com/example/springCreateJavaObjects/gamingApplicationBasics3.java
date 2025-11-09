package com.example.springCreateJavaObjects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration

@ComponentScan
public class gamingApplicationBasics3 {
    public static void main(String[] args){
        var context=new AnnotationConfigApplicationContext(gamingApplicationBasics3.class);
        context.getBean(GameRunner3.class).run();

    }
}
