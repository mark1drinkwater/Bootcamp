package com.in28minutes.learnspringframework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;
import com.in28minutes.learnspringframework.helloworld.HelloWorldConfiguration;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new SuperContraGame();
//		var game = new MarioGame();
		var game = new PacmanGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game);
		//2: Object Creation + Wiring of Dependencies
		// Game is a Dependency of GameRunner
		gameRunner.run();		
	}

}
