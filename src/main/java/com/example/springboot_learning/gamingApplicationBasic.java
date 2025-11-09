package com.example.springboot_learning;

import com.example.springboot_learning.game.GameRunner;
import com.example.springboot_learning.game.MarioGame;
import com.example.springboot_learning.game.Snake;

public class gamingApplicationBasic {
    public static void main(String[] args){
        var mario=new MarioGame();
        var snake=new Snake();
        var gamerunner=new GameRunner(snake);
        gamerunner.run();
    }


}
