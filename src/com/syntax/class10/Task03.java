package com.syntax.class10;

public class Task03 {
public static void main(String[] args) {
	String[]countries= {"China","Spain","Brazil"};
	for(int i=0;i<countries.length;i++) {
		if(countries[i].equals("China")) {
			System.out.println("Beijing");
		} else if(countries[i].equals("Spain")) {
			System.out.println("Madrid");
		} else if(countries[i].equals("Brazil")) {
			System.out.println("Brazilia");
		}else {
			System.out.println(countries[i]);
		}
	}
}
}
