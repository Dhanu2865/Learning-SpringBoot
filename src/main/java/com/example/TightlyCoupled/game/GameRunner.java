package com.example.TightlyCoupled.game;

public class GameRunner {

    Snake game=new Snake();
    public GameRunner(Snake game) {
        this.game = game;
    }
    public void run(){
        System.out.println("Snake is Running");
        game.up();
        game.down();
        game.left();
        game.right();
    }

}
