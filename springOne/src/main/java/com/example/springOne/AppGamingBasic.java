package com.example.springOne;

import com.example.springOne.game.GameRunner;
import com.example.springOne.game.MarioGame;
import com.example.springOne.game.PacMan;
import com.example.springOne.game.SuperGame;

public class AppGamingBasic {
    public static void main(String[] args) {

       var marioGame=new MarioGame();
      var superGame=new SuperGame();

      var gameRunner1=new GameRunner(superGame);
       gameRunner1.run();


        var gameRunner=new GameRunner(marioGame);
        gameRunner.run();

        var panManGame=new PacMan();
        var gameRunner2=new GameRunner(panManGame);
        gameRunner2.run();



    }
}
