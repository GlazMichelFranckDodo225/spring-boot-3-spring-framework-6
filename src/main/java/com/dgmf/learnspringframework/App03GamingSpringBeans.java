package com.dgmf.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dgmf.learnspringframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
		}

		// var game = new MarioGame();
		// var game = new SuperContraGame();
//		var game = new PacmanGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();

	}

}
