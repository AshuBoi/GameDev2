package com.ashuboi.gameapp;


import com.ashuboi.gameapp.Game.GamingConsole;
import com.ashuboi.gameapp.Game.MarioGame;
import com.ashuboi.gameapp.Game.PacmanGame;
import com.ashuboi.gameapp.Game.SuperContraGame;
import com.ashuboi.gameapp.RunnerGames.GameRunnner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ashuboi.gameapp.Game")
@ComponentScan("com.ashuboi.gameapp.RunnerGames")
public class GameDevApplication {

//    @Bean
//    public GamingConsole gamingConsole() {
//        return new PacmanGame();
//    }


    //    @Bean
//    public GameRunnner gameRunnner(GamingConsole game) {
//        System.out.println(game);
//        return new GameRunnner(game);
//    }
    public static void main(String[] args) {
////        var game = new MarioGame();
////        var game = new SuperContraGame();
//        var game = new PacmanGame();
//        var gameRunner = new GameRunnner(game);
//        gameRunner.run();
        try(var context =
                    new AnnotationConfigApplicationContext
                            (GameDevApplication.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunnner.class).run();
        }
    }

}
