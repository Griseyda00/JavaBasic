package com.syntax.class18;

public class USA {
//create a variable to hold a state and capital of the state
	String state,stateCapital;
	// create method to display state and stateCapital
	public  void display() {
		System.out.println(state+" and it's capital is "+stateCapital);
	}
	public USA(String state,String stateCapital) {
		//This. statement always points out to the instance variable 
		//if your local variable its the same as the instance variable
		//always the local variable has the this.statement
		//this.local=instance variable;
		this.state=state;
		this.stateCapital=stateCapital;
	}
	public static void main(String[] args) {
		USA usa=new USA("Virginia","Richmond");
		usa.display();
	}
}
