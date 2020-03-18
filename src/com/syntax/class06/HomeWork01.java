package com.syntax.class06;

import java.util.Scanner;

public class HomeWork01 {
public static void main(String[] args) {
	Scanner scan;
	char grade;
	String exp;
	scan=new Scanner (System.in);
	System.out.println("please enter your grade");
	grade=scan.next().charAt(0);
	switch(grade) {
	case'A':
		exp="Excellent";
		break;
	case'B':
		exp="Good";
		break;
	case 'C':
		exp="Average";
		break;
	case 'D':
		exp="Bad";
		break;
	default:
		exp="Not Acceptable";
		break;
	}
	System.out.println("your "+grade+" was "+exp);
}
}
