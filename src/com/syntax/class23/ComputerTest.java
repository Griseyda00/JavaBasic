package com.syntax.class23;

public class ComputerTest {
public static void main(String[] args) {
	Computer[] comp= {new Apple("150GB"), new Lenovo("100GB"), new HP("130GB"),new Dell("200GB")};
	for(Computer c:comp) {
		c.Keyword();
		c.UseHeadPhones();
		System.out.println("--------------");
	}
}
}
