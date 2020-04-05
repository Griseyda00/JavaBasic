package com.syntax.class19;

public class TestClass {
public static void main(String[] args) {
	Dog dog=new Dog();
	dog.breed="Husky";
	dog.color="Black";
	dog.fur="yes";
	dog.size="any";
	dog.bark();
	dog.eat();
	Cat cat=new Cat();
	cat.drink="Milk";
	cat.BigEyes=true;
	Cat.drink();
}
}
