package com.syntax.class22;

public class CreditCardTest {
public static void main(String[] args) {
	CreditCard one1=new CreditCard(500);
	double one3=one1.calculateIn();
	System.out.println(one3);
	
	Visa one2=new Visa(500);
	 one3=one2.calculateIn();
	System.out.println(one3);
	
	AX one4=new AX(500);
	 one3=one4.calculateIn();
	System.out.println(one3);
	
}
}
