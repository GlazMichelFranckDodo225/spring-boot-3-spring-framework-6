package com.dgmf.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.dgmf.learnspringframework.game.GameRunner;
import com.dgmf.learnspringframework.game.GamingConsole;
import com.dgmf.learnspringframework.game.PacmanGame;

@Configuration
class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new PacmanGame();

		return game;
	}

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);

		return gameRunner;
	}

}

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
