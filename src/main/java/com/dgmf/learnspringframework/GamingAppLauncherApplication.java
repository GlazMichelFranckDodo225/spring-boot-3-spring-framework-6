package com.dgmf.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dgmf.learnspringframework.game.GameRunner;
import com.dgmf.learnspringframework.game.GamingConsole;
import com.dgmf.learnspringframework.game.MarioGame;
import com.dgmf.learnspringframework.game.PacmanGame;

@Configuration
@ComponentScan("com.dgmf.learnspringframework.game")
public class GamingAppLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

	}

}
