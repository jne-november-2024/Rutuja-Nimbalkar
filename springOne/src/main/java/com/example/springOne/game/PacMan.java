package com.example.springOne.game;

import com.example.springOne.GamingConsole;

public class PacMan implements GamingConsole {
    @Override
    public void up() {
        System.out.println("jump");
    }

    @Override
    public void down() {
        System.out.println("down");

    }

    @Override
    public void left() {
        System.out.println("move to left");
    }

    @Override
    public void right() {

        System.out.println("move to right");
    }
}
