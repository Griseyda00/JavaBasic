package com.syntax.class22;

public class Bank {
double money,fee;
 Bank(double money){
	 this.money=money;
 }
double chargeFee() {//overridden method
	if(money<1000) {
		fee=money*0.1;
	}else {
		fee=0;
	}
	return fee;
}

}
class BOA extends Bank{
	public BOA(double money){
	super(money);
	}
}
class PNC extends Bank{
	public PNC(double money){
	super(money);
	}
	@Override
double chargeFee() {// overriding method
	if(money<1000) {
		fee=money*0.2;
	}
	return fee;
}
}