package com.example.springContext;

public class GameRunner2 {
    private final com.example.springContext.gamingConsole2 game;
    public GameRunner2(com.example.springContext.gamingConsole2 game) {
        this.game=game;
    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
