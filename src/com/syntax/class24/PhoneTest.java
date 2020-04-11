package com.syntax.class24;

public class PhoneTest {
public static void main(String[] args) {
	//new Phone();//we cannot have a obj of the base class
	//but we can a obj of the subclass
	Phone iphone=new iPhone();
	iphone.call();
	iphone.text();
	iphone.takePicture();
	iphone.playMusic();
	
}
}
