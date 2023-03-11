package com.dgmf.learnspringframework;

import com.dgmf.learnspringframework.game.GameRunner;
import com.dgmf.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		var marioGame = new MarioGame();
		var gameRunner = new GameRunner(marioGame);
		gameRunner.run();
		

	}

}
