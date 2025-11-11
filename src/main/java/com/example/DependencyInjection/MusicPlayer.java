package com.example.DependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class MusicPlayer {
    public static void main(String[] args){
        System.out.println("Dependency Injection");

        var context=new AnnotationConfigApplicationContext(MusicPlayer.class);
        context.getBean(MusicplayerField.class).play();
        context.getBean(MusicplayerConstructor.class).play();
        context.getBean(MusicplayerSetter.class).play();
    }
}
