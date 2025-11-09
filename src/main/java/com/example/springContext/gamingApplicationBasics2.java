package com.example.springContext;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class gamingApplicationBasics2 {
    public static void main(String[] args){
        var context=new AnnotationConfigApplicationContext(gamingConfiguration.class);
        context.getBean(GameRunner2.class).run();

    }
}
