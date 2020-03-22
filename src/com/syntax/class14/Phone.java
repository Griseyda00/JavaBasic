package com.syntax.class14;

public class Phone {
  String type;
  String color;
  String model;
  
  void turnOn() {
	  System.out.println(type+" can turn on");
  }
  void difColors() {
  System.out.println(type+" has different colors");
  }
  public static void main(String[] args) {
	 
	Phone phone1=new Phone();
	phone1.type="Iphone";
	phone1.color="multiple colors";
	phone1.model="Iphone X";
	phone1.turnOn();
	phone1.difColors();
	
	Phone phone2=new Phone();
	phone2.type="Android";
	phone2.color="Black";
	phone2.model="s5";
	phone2.turnOn();

	Phone phone3=new Phone();
	phone3.type="Nokia";
	phone3.color="White";
	phone3.model="s";
	phone3.turnOn();
	String str="Hello friends";
	str=str.replace("Hello","Welcome");
	System.out.println(str);
}
}
