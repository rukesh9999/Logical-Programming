package com.logics.javaconcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		
		
		Map<Integer, String> customers =new HashMap<>();
		customers.put(1, "rukesh");
		customers.put(2, "nani");
		customers.put(3, "rakesh");
		customers.put(4, "raghu");
		customers.put(5, "mani");
		System.out.println("way 1");
		
		for(Map.Entry<Integer, String>  entry :customers.entrySet())
		{
			System.out.println("key......"+entry.getKey() +"     "+"value..........."+entry.getValue());
		}
		
		
		System.out.println("way 2");
		
		for(Integer key : customers.keySet())
		{
			System.out.println("key......"+key +"     "+"value..........."+customers.get(key));
		}
		
		System.out.println("way 3");
		customers.forEach( (key,value)-> System.out.println(key+".........."+value));
		
		System.out.println("way 4");
		
		customers.entrySet().stream().forEach((key)->{
			System.out.println(key);
		});
		
		
		System.out.println("way 5");
		
	   Iterator<Map.Entry<Integer, String>>   itr =  customers.entrySet().iterator();
	  
	   while(itr.hasNext())
	   {
		  Map.Entry<Integer, String> entry   = itr.next();
		  System.out.println(entry.getKey()+".........."+entry.getValue());
	   }
		
			
		}
	
}
