package com.dgmf.learnspringframework;

import com.dgmf.learnspringframework.game.GameRunner;
import com.dgmf.learnspringframework.game.MarioGame;
import com.dgmf.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// var game = new MarioGame();
		var game = new SuperContraGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		

	}

}
