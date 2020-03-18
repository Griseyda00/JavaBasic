package com.syntax.class11;

public class recap {
public static void main(String[] args) {
	String[][] groceries= {{"cucumber","potato","carrot"},
			               {"mango","apple","banana","Kiwi"},
			               {"Milk","cheese","yogurt"},
	};
    for(String[] array:groceries) {
    	for(String items:array) {
    		System.out.print(items+" ");
    	}
    	System.out.println();
    }
    System.out.println(groceries[1][2]);
    
    //get all values from 2D array
    //loop through rows
    for(int r=0; r<groceries.length; r++) {
        //loop through columns
        for(int c=0; c<groceries[r].length; c++) {
            System.out.print(groceries[r][c]+" ");
        }
        System.out.println();
    }

}
}
