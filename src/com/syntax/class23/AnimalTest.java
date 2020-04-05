package com.syntax.class23;

public class AnimalTest {
public static void main(String[] args) {
	//Animal ani=new Animal();
	//ani.whoAmI();
	// static members always belongs to the class
	// not to the obj
	//We are not overriding , this process it's call method hidden
	Animal.whoAmI();
	//this method is static is coming from the father
	Bird.whoAmI();
	// this method is static is coming from the child
}
}
