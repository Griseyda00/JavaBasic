package com.syntax.class08;

public class Task01 {
public static void main(String[] args) {
	int odds=0;
	int even=0;
	for(int i=1;i<=99; i++) {
		if(i%2==0) {
		odds=odds+i;
		
		}else{
			even=even+i;
			
		}
	}
	System.out.println(odds);
	System.out.println(even);
}
}
