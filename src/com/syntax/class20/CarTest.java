package com.syntax.class20;

public class CarTest {
	public static void main(String[] args) {
		
	
  //Car car=new Car();
  System.out.println("-----child-----");
  Mercedes merc=new Mercedes();
  merc.display();
  System.out.println("====----------------");
  Mercedes merc1=new Mercedes("mercedes","m","no AMG");
  merc1.display();
  System.out.println("--------------------------");
  Mercedes merc2=new Mercedes("mercedes","s","AMG");
  merc2.display();
	}
}
