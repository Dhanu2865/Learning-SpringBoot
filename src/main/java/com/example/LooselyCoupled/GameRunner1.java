package com.example.LooselyCoupled;

public class GameRunner1 {
    private final gamingConsole game;
    public GameRunner1(gamingConsole game) {
        this.game=game;
    }
    public void run(){
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
