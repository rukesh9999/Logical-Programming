package com.logics.strings;

import java.util.HashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "rukesh");
		
	    Employee emp1 =new Employee(1, "rukesh"); 
	    
		//Integer i1 = new Integer(1);
		//Integer i2 = new Integer(1);
		
		HashMap<Employee,Employee> map = new HashMap<>();
		
		map.put(emp, emp);
		map.put(emp1, emp1);
		
		//map.put(i1, i1);
		//map.put(i2, i2);
		
		//System.out.println(map);
		
		//r
		//* u
		//* * k
		//* * * e
		//* * * * s
		//* * * * * h
		
		String str="rukesh";
		
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<=i;j++)
			{
				
				if(i==j) {System.out.print(str.charAt(j));}
				else
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
