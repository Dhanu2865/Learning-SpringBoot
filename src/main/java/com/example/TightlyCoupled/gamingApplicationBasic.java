package com.example.TightlyCoupled;

import com.example.TightlyCoupled.game.GameRunner;
import com.example.TightlyCoupled.game.MarioGame;
import com.example.TightlyCoupled.game.Snake;

public class gamingApplicationBasic {
    public static void main(String[] args){
        var mario=new MarioGame();
        var snake=new Snake();
        var gamerunner=new GameRunner(snake);
        gamerunner.run();
    }


}
