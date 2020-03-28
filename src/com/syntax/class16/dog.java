package com.syntax.class16;

public class dog {
//instance variable
String name,size;
int age;
//static variable 
static String breed="Husky";
static int paw=4;
static int tail=1;
static int eyes=2;

void display() {
	System.out.println(name+" "+size+" "+age);
	System.out.println(paw+" "+tail+" "+eyes+" "+breed);
}
public static void main(String[] args) {
	dog dog1=new dog();
	dog1.age=5;
	dog1.age=6;
	dog1.name="Lucy";
	dog1.size="Big";
	dog1.display();
	// how to acess static variable;
	System.out.println(dog1.breed);
	breed="Bulldog";
	System.out.println(dog1.breed);
	dog dog2=new dog();
	dog2.age=2;
	dog2.name="Sharki";
	dog2.size="small";
	dog2.display();
}
}
