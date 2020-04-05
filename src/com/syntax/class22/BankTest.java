package com.syntax.class22;

public class BankTest {
public static void main(String[] args) {
	Bank bank=new Bank(700);
	double fee=bank.chargeFee();
	System.out.println(fee);
	PNC bank1=new PNC(700);
	 fee=bank1.chargeFee();
	System.out.println(fee);
	
}
}
