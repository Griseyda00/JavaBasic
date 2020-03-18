package com.syntax.class09;

public class ArraysIntro {
public static void main(String[] args) {
	int[]array=new int[4];
	array[0]=10;
	array[1]=20;
	array[2]=30;
	array[3]=40;
	System.out.println(array[1]);
	//second way
	String[]carArray;
	carArray=new String[5];
	carArray[0]="BMW";
	carArray[1]="Toyota";
	carArray[2]="Honda";
	carArray[3]="Tesla";
	carArray[4]="Lambo";
	System.out.println("I am driving "+carArray[4]);
	System.out.println("------=--------------");
	// you can also change the number of the value
	//and also you can also add the elements
	int[]numbers=new int[6];
	numbers[0]=100;
	numbers[1]=200;
	numbers[2]=300;
	numbers[3]=400;
	System.out.println(numbers[4]);
	//arrays are fixed on sides
	//compiler will place a default value if you dont
	//declare a variable
	// you can not star your array from [1] 
	String[]inClass=new String[5];
	inClass[1]="Hi";
	inClass[2]="hi1";
	inClass[3]="hi2";
	inClass[4]="hi3";
	//inClass[5]="Hi4";
	System.out.println(inClass[4]);
	
}
}
