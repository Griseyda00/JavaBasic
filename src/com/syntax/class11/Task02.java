package com.syntax.class11;

public class Task02 {
public static void main(String[] args) {
	String[][] countries= {{"USA "," Canada "," Mexico "},
			               {" Brazil "," Colombia "," Peru "},
			               {" Tur "," Kaza "},
	};
	int counter=0;
	for(int i=0;i<countries.length;i++) {
		for(int y=0;y<countries[i].length;y++) {
			System.out.print(countries[i][y]);
			counter++;
		}
		System.out.println();
	}
     System.out.println(counter);

}
}