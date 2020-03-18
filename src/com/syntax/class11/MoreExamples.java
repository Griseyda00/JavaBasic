package com.syntax.class11;

public class MoreExamples {
public static void main(String[] args) {
	//lest create 2D array in which we store professions
	String[][] professions= {{"QA","Dev","PO","SM"},
			                 {"math teacher","Science teacher","ESL teacher"},
			                 {"Dentist","Surgeon"},
	};
	for(String[] occupation:professions) {
		for(String tittle:occupation ) {
			System.out.print(tittle+" ");
		} 
		System.out.println();
	}
}
}
