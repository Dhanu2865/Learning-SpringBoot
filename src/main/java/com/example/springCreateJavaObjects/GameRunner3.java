package com.example.springCreateJavaObjects;

import com.example.springCreateJavaObjects.gamingConsole3;
import org.springframework.stereotype.Component;

@Component
public class GameRunner3 {
    private final gamingConsole3 game;
    public GameRunner3(gamingConsole3 game) {
        this.game=game;
    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
