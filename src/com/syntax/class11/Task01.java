package com.syntax.class11;

public class Task01 {
public static void main(String[] args) {
	String[][] cars= {{"Ford","Lincoln","lexus"},
	                  {"Kia","Hyundai"},
	                  {"Ferrari","Lambo","Lanci"},
	              
	
	};
     for(String[]car:cars) {
	for(String name:car) {
		System.out.print(name+" ");
	}
	System.out.println();
}
     System.out.println();
	for(int i=0;i<cars.length;i++) {
		for(int y=0;y<cars[i].length;y++) {
		System.out.print(cars[i][y]+" ");
	}
	System.out.println();
	}
}
}