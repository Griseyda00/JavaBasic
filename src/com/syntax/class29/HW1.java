package com.syntax.class29;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HW1 {
	//Create a map of a building. 
	//Store floor number and it is associated company name.
	//(Example: 1= Google, 2=Syntax etc..). 
	//Insert 7 entries with duplicate keys and values. 
	public static void main(String[] args) {
//		Map<String,Integer> r=new LinkedHashMap<>();
//		r.put("Google",1);
//		r.put("Syntax",2);
//		r.put("Amazon",4);
//		r.put("FaceBook", 4);
//		r.put("MGM",7);
//		r.put("MGM", 6);
//		r.put("Channel",4);
//		//method returns a set having same elements  as the hash map
//	    System.out.println(r.entrySet());
//	    System.out.println(r);
//	    //return only values following the order of LinkedHasMap();
//	    System.out.println(r.values());
//	    //returns only key in order 
//	    System.out.println(r.keySet());
//	    System.out.println("I have "+r.size()+" entries");
//	     r.remove("Amazon",4);
//	     System.out.println(r);
//	     r.replace("FaceBook", 5);
//	     System.out.println(r);	
	     HW1 obj=new HW1();
	     obj.setup();
	        
	     
	     
	}
	Map<String,Integer> r1;
	public void setup() {
		r1=new LinkedHashMap<>();
		r1.put("Google",1);
		r1.put("Syntax",2);
		r1.put("Amazon",4);
		r1.put("FaceBook", 4);
		r1.put("MGM",7);
		r1.put("MGM", 6);
		r1.put("Channel",4);
		//method returns a set having same elements  as the hash map
	    System.out.println(r1.entrySet());
	    System.out.println(r1);
	    //return only values following the order of LinkedHasMap();
	    System.out.println(r1.values());
	    //returns only key in order 
	    System.out.println(r1.keySet());
	    System.out.println("I have "+r1.size()+" entries");
	     r1.remove("Amazon",4);
	     System.out.println(r1);
	     r1.replace("FaceBook", 5);
	     System.out.println(r1);	
	}
	
}
