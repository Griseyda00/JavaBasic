package com.syntax.class10;

public class RetrieveElements {
public static void main(String[] args) {
	char[] grades= { 'A','B','C','D','E','F'};
	for(int i=0; i<grades.length;i++) {
		System.out.print(grades[i]+" ");
	}
	System.out.println();
	System.out.println("++++++advance for loop+++++");
	for(char grade:grades) {
		System.out.print(grade+" ");
	}
}
}
