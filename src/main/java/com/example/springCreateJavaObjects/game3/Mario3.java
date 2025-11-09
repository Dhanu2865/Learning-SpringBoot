package com.example.springCreateJavaObjects.game3;

import com.example.springCreateJavaObjects.gamingConsole3;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component
@Primary
public class Mario3 implements gamingConsole3 {
    public void up(){
        System.out.println("Mario1 Game up");
    }
    public void down(){
        System.out.println("Mario1 Game down");
    }
    public void left(){
        System.out.println("Mario1 Game left");
    }
    public void right(){
        System.out.println("Mario1 Game right");
    }
}
