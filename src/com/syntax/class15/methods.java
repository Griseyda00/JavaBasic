package com.syntax.class15;

public class methods {
//create a method that will say welcome ten times
	void sayWelcome() {
		for (int i=0;i<=10;i++) {
			System.out.println("Welcome");
		}
	}
	void sayAnything(String word, int times) {
		for(int i=1;i<=times;i++) {
			System.out.println(word);
		}
	}
	void isItRaining(boolean isRain) {
		if(isRain) {
			System.out.println("It is raing stay home");
		}else {
			System.out.println("It is not raining go outside");
		}
	}
	
}
