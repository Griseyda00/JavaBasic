package com.syntax.class16;

public class MethodsRecap {
//create a method that will accept array of integer and return
//max element from that array
	int getLargestNumber(int[] array) {
		int largest=array[0];
	 for(int i=1;i<array.length;i++) {
		 if(array[1]>largest) {
			 largest=array[1];
		 }
	 }
	 return largest;
	}
	String[] getWords(String str) {
		String[] array=str.split(" ");
		return array;
	}
	public static void main(String[] args) {
		MethodsRecap obj=new MethodsRecap();
	  int [] arr= {10,12,89,99};
	  int loop=obj.getLargestNumber(arr);
System.out.println(loop);
	}
	
}
