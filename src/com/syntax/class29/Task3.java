package com.syntax.class29;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
//import java.util.Set;

public class Task3 {
	//Create a Set collection that will hold Objects of Student Type.
	//In this set we do not care about the insertion order. 
	//Each student object should have name and studentID. Display name of each student.
public static void main(String[] args) {
	Collection<Student> r=new HashSet<>();
	r.add(new Student("123","Laura"));
	r.add(new Student("145","Sarmed"));
	r.add(new Student("235","Mahady"));
	r.add(new Student("345","Brian"));
	 Iterator<Student> re=r.iterator();
	 while(re.hasNext()) {
		Student ri=re.next();
		System.out.println(ri.display());
	 }
	

    

	
	
}

}
class Student{
String ID;
String name;
 Student(String ID, String name) {
this.name = name;
this.ID=ID;
}

public String display() {
	//System.out.println(name+" "+ID);
	return name+" "+ID;
}
}