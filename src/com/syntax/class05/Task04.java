package com.syntax.class05;

import java.util.Scanner;

public class Task04 {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your birth month");
	String month=scan.nextLine();
	String season;
	season=null;
	if( month.equals("june")|| month.equals("July")|| month.equals
			("August")){
		season="summer";
	}else if(month.equals("December")|| month.equals("January")||month.equals
			("February")){
		season="winter";
	}else if(month.equals("March")|| month.equals("April")|| month.equals
			("May")) {
		season="spring";
	}else if (month.equals("September")|| month.equals("October")|| month.equals
			("November")) {
		season="fall";
	}else {
		System.out.println("Invalid month");
	}
	System.out.println("You were born in "+season);
}
}
