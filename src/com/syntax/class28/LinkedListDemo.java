package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
  LinkedList<String> llist=new LinkedList<>();
  llist.add("Yunus");
  llist.add("Reyhan");
  llist.add("Pavel");
  llist.add("Farid");
  int size=llist.size();
  System.out.println(size);
  
  for(String r:llist) {
	  System.out.print(r+" ");
	}
  System.out.println("-----==-----");
  for(int i=0;i<llist.size();i++) {
	  System.out.print(llist.get(i));
  }
  System.out.println("______________");
  Iterator<String> r1=llist.iterator();
  while(r1.hasNext()) {
	  System.out.print(r1.next());
  }
}
}