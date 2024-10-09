package com.ashuboi.gameapp.RunnerGames;

import com.ashuboi.gameapp.Game.GamingConsole;
import com.ashuboi.gameapp.Game.MarioGame;
import com.ashuboi.gameapp.Game.SuperContraGame;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunnner {

//    private MarioGame game;
    private GamingConsole game;

    public GameRunnner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
