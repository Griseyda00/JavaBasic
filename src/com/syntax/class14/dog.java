package com.syntax.class14;

public class dog {
  String breed;
  String color;
  String name;
  int age;
  
  public static void main(String[] args) {
	dog dog1=new dog();
    dog1.breed="shin tzu";
    dog1.color="brown";
    dog1.name=" loli";
    dog1.age=2;
    dog dog2=new dog();
    dog2.breed="bulldog";
    dog2.color="brown";
    dog2.name=" lolo";
    dog2.age=2;
    
    System.out.println(dog1.breed);
    dog1.eat();
    dog1.bark();
    dog1.run();
    
    dog2.eat();
    dog2.bark();
    dog2.run();
}
  void eat() {
	  System.out.println(name+" can eat");
  }
  void bark() {
	  System.out.println(name+" can bark");
  }
  void run() {
	  System.out.println(name+" can run");
  } 

}
