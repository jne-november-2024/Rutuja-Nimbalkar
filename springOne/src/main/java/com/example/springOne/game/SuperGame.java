package com.example.springOne.game;

import com.example.springOne.GamingConsole;

public class SuperGame implements GamingConsole
{
    @Override
    public void up() {

        System.out.println("move");
    }

    @Override
    public void down() {

        System.out.println("sit");
    }

    @Override
    public void left() {

        System.out.println("position");
    }

    @Override
    public void right() {
        System.out.println("fire");
    }
}
