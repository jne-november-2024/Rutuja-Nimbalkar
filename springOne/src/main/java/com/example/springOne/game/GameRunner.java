package com.example.springOne.game;

import com.example.springOne.GamingConsole;

public class GameRunner {
    //private MarioGame marioGame;
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
    this.game=game;
    }

    public void run(){
        System.out.println("Running game: "+ game);
        game.up();
        game.left();
        game.right();
        game.down();
    }

}
