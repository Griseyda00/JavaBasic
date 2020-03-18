package com.syntax.class05;

public class logicalAnd {
  public static void main(String[] args) {
	/*if decared number is
	 * between 1-10->  This is small
	 * between 11-100->This is big number
	 * between 101-1000->This is larger number
	 */
	  int num=78;
	  if(num>1 && num<=10) {
		  System.out.println("This number is small");
	  }else if (num>10 && num<=100) {
		  System.out.println("This is a big number");
	  }else if (num>100 && num<=1000) {
		  System.out.println("Number is a large number");
	  }else 
		  System.out.println("number is super large");
}
}
