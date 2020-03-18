package com.syntax.class10;

public class Task05 {
public static void main(String[] args) {
	String[][] month= {{"January ","February ","March "},
	                   {"April ","May ","June ","July "},
	                   {"September ","October ","November ",
	                	   "December "},
	};
	for(int i=0;i<month.length;i++) {
		System.out.println();
		for(int y=0; y<month[i].length;y++) {
			System.out.print(month[i][y]);
		}
		
	}
	System.out.println();
	int rows=month.length;
	int fArray=month[0].length;
	System.out.println(fArray);
	
}
}
