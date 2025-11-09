package com.example.springContext;

public class GameRunner2 {
    private final gamingConsole2 game;
    public GameRunner2(gamingConsole2 game) {
        this.game=game;
    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
