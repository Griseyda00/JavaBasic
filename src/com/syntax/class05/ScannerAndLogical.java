package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogical {
public static void main(String[] args) {
	/*ask a user for how much his sales are
	 * calculate  commission
	 * sales
	 * 1-100--> commission should be 10%
	 * 100-200--> commission should be 20%
	 * 200--500--> commission should be 30%
	 * $>500--> commission should be 50%
	 */
	//declare variables
	Scanner scan;
	double sales;
	double commission;
	 scan=new Scanner(System.in);
	 System.out.println("Please enter your sales amount");
	 sales=scan.nextDouble();
	 if(sales>=1 && sales<=100) {
		 //give user 10% commission
		 commission=sales*0.10;
	 }else if(sales>100 && sales<=200) {
		 //give user 20% commission
		 commission=sales*0.2;
	 }else if (sales>200 && sales<=500) {
		 //give user 30% commission
		 commission=sales*0.3;		 
	 }else {
		 commission=sales*05;
	 }
	 System.out.println("Based on your commission is "+commission);
	 if (commission>100) {
		 System.out.println("You are a great seller");
	 }
	
}
}
