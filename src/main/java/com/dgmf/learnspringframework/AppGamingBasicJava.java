package com.dgmf.learnspringframework;

import com.dgmf.learnspringframework.game.GameRunner;
import com.dgmf.learnspringframework.game.MarioGame;
import com.dgmf.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
		

	}

}
