package com.logics.trickyjavaquestions;

import com.logics.strings.Employee;

public class finalKeyword {

	public static void main(String[] args) {
		
		
		final Employee emp ;
		         emp= new Employee();
		        
		new finalKeyword().m1(emp);
		
		
	}
	
	void m1(Employee emp) {
		
		emp= new Employee();
	}
	
}
