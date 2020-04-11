package com.syntax.class25;

public interface trustable {
	//by default compiler will make method to be public and abstract
void trust();
}
interface Bank extends trustable{
	//by default compiler will make method to be public and abstract
	void deposit();
	//by default compiler will make method to be public and abstract
	void withdraw();
}
class  BOA extends Finance implements Bank,CreditUnion{

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
		
	}

	@Override
	public void deposit() {
		System.out.println("you can make a deposit at BOA");
		
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw your money at BOA");
		
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit");
		
	}
}
interface CreditUnion{
	void giveCredit();
}
class Finance{
	public void financing() {
	}
}