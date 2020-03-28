package com.syntax.class15;

public class Task4 {
void country(String con) {
	String word=null;
	if(con.equalsIgnoreCase("USA")) {
		word="Hello";
	}else if(con.equalsIgnoreCase("spain")) {
		word="Hola";
	}
	System.out.println(word);
}
public static void main(String[] args) {
	Task4 countries=new Task4();
	countries.country("spain");
}
}
