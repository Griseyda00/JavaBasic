package com.syntax.class05;

import java.util.Scanner;

public class Task03 {
public static void main(String[] args) {
	Scanner scan;
	int quiz;
	int midTerm;
	int finalScores;
    String average;
	double gA;
	scan=new Scanner(System.in);
	System.out.println("What is your quiz score?");
	quiz=scan.nextInt();
	System.out.println("What is your mid term score?");
	midTerm=scan.nextInt();
	System.out.println("What is your final score?");
	finalScores=scan.nextInt();
	 gA=quiz+midTerm+finalScores;
	average=null;
	if(gA/3>=90 ) {
		average="A";
	}else if(gA/3>=70 && gA/3<=90) {
		average="B";
	}else if(gA/3>=50 && gA/3<=70) {
		average="C";
	}else if (gA/3<50) {
		average="F";
	}
	System.out.println("Your final GPA is "+average);
}
}
