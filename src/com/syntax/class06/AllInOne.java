package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {
public static void main(String[] args) {
	/*write a program to ask user if there is a sale
	 * if no sale --> not going to shopping
	 * if sale we will ask the price of the item
	 * if price less than 20--> apply 10%
	 * if price between 120 --> 100 -->apple 20%
	 * if price more than 500--->  apply 50%
	 */
	Scanner scan;
	String sale;
	double price=0.0;
	double discount=0.0;
	double finalPrice=0.0;
	scan=new Scanner (System.in);
	System.out.println("Do you a sale?");
	sale=scan.nextLine();
	if(sale.equalsIgnoreCase("yes")) {
		System.out.println("What is the price");
		price=scan.nextDouble();
		if(price>=20) {
			discount=price*0.10;
			finalPrice=price-discount;
		}else if(price<=21 && price<=100) {
			discount=price*0.20;
			finalPrice=price-discount;
		}else if(price>=101 && price<=500) {
			discount=price*0.30;
			finalPrice=discount-price;
		}else if(price>500);
		discount=price*0.50;
		finalPrice=price-discount;
	}else 
		System.out.println("Im not going to shop!");
	
    if(!sale.equalsIgnoreCase("no")) {
	System.out.println("after "+discount+ " discount the price "
			+ "of the item reduced from "+price+ " to "+finalPrice);
    }

}
}
