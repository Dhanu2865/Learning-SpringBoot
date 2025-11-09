package com.example.LooselyCoupled;


public class gamingApplicationBasics1 {
    public static void main(String[] args){
        var pac=new com.example.LooselyCoupled.pacman();
        var mario=new com.example.LooselyCoupled.Mario1();

        var gamerunner=new GameRunner1(pac);
        gamerunner.run();
    }
}
