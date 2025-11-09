package com.example.LooselyCoupled;


import com.example.LooselyCoupled.game1.Mario1;
import com.example.LooselyCoupled.game1.pacman;

public class gamingApplicationBasics1 {
    public static void main(String[] args){
        var pac=new pacman();
        var mario=new Mario1();

        var gamerunner=new GameRunner1(pac);
        gamerunner.run();
    }
}
