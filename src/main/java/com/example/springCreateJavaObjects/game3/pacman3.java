package com.example.springCreateJavaObjects.game3;

import com.example.springCreateJavaObjects.gamingConsole3;
import org.springframework.stereotype.Component;

@Component
public class pacman3 implements gamingConsole3 {
    public void up(){
        System.out.println("pacman Game up");
    }
    public void down(){
        System.out.println("pacman Game down");
    }
    public void left(){
        System.out.println("pacman Game left");
    }
    public void right(){
        System.out.println("pacman Game right");
    }
}
