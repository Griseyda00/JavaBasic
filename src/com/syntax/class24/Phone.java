package com.syntax.class24;

public abstract class Phone {
	//implemented method
public void call() {
	System.out.println("Phone can make a call");
}

public void text() {
	System.out.println("Phone can send text");
}
//unimplemented method
public abstract void takePicture();
public abstract void playMusic();
}
class iPhone extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Iphone takes pictures");
		
	}

	@Override
	public void playMusic() {
		System.out.println("Iphone play music");
		
	}
	
}
class Samsung extends Phone{

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
		
	}

	@Override
	public void playMusic() {
    System.out.println("Samsung pay music");
		
	}
	
}