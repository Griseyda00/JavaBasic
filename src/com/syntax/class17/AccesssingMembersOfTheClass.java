package com.syntax.class17;
import com.syntax.class17.Employee;
public class AccesssingMembersOfTheClass {
	public static void main(String[] args) {

		Employee emp = new Employee();
		Employee.name = "faisal";
		emp.lastName = "sakhi";
		emp.salary = 11122;
		// but you cannot access ssn
         Employee.method1();
         emp.method2();
         emp.method3();
         
	}
}
