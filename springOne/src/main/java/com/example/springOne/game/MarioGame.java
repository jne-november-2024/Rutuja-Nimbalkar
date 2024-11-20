package com.example.springOne.game;

import com.example.springOne.GamingConsole;

public class MarioGame implements GamingConsole {

    public void up(){
        System.out.println("Up jump");
    }


    public void down(){
        System.out.println("Go inside a hole");
    }

    public void left(){
        System.out.println("left go back");
    }

    public void right(){
        System.out.println("right increase");
    }


}
