package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2_2 {
public static void main(String[] args) {
	ArrayList<String> word=new ArrayList<>();
	word.add("book");
    word.add("me");
//    word.add("bee");
//    word.add("speak");
//    word.add("sellinnium");
//    word.add("queue");
    Iterator<String> remove=word.iterator();
    while(remove.hasNext()) {
       String removes=remove.next();
       if(removes.endsWith("e")) {
    	   remove.remove();
       }
    }
    System.out.println(word);
}
}
