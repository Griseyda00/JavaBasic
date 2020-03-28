package com.syntax.class15;

public class CreatingMethods {
public static void main(String[] args) {
	CreatingMethods grade= new CreatingMethods();
	char total=grade.letter(68);
	System.out.println(total);
	String re=null;
	if(total=='A'|| total=='B') {
		re="good job";
	}else {
		re="keep working hard";
	}
	System.out.println(re);
}
  char letter(int a) {
	  char letter;
	  if(a>90) {
		 letter='A';
	  }else if(a<90 && a>=80) {
		  letter='B';
	  }else if(a<79 && a>=70) {
		  letter='C';
	  }else if (a<69 && a>=50) {
		  letter='D';
	  }else {
		  letter='F';
	  }
	  return letter;
  }
	

}
