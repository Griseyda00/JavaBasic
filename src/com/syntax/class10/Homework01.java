package com.syntax.class10;


public class Homework01 {
public static void main(String[] args) {
	String[][] names= {{"Mr","Mrs","Ms","Miss"},
			            {" Smith "," Jordan "," Jackson "," Obama "}};
	System.out.print(names[0][2]);
	System.out.println(names[1][0]);
	/// Ms Smith
	System.out.println(names[0][0]+names[1][3]);
	//Mr Obama
	System.out.println(names[0][2]+names[1][2]);
	//Ms Jackson
	System.out.println(names[0][3]+names[1][1]);
	// Miss Jordan
	
}
}
