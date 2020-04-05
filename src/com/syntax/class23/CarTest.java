package com.syntax.class23;

public class CarTest {
 public static void main(String[] args) {
	Car[] cars= {new BMW("BMW"),new Mercedes("Mercedes"),new Tesla("Tesla"),new Honda("Honda")};
	int count=1;
	for(Car s:cars) {
		System.out.println("car "+count+++" --------++++++++++++++"); 
		s.display();
	   s.start();
	}
//	for(int i=0;i<cars.length;i++) {
//		cars[i].display();
//		cars[i].start();
//	}
	
}
}
