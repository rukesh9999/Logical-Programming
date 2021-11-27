package com.logics.strings;

import java.io.PrintStream;

public class SalesSimulator {

	
	public static int getSales()
	{
		
		return 200;
	}
	
	public static int calculateBonus(int goal,int numDays)
	{
		int bonus=0;
		if(goal>0 && numDays>0) {
		  for(int day=0;day<=numDays;day++)
		  {
			  if(getSales()>=(goal)*(80/100) && getSales()<goal)
			  {
				  bonus+=50;
			  }else if(getSales()>=(goal)*(80/100) && getSales()>=goal)
			  {
				  bonus+=75;
			  }
			  
		  }
		  
		 
		}else {
			
			throw new RuntimeException("goal and numDays must be greater than zero ");
		}
		
		 return bonus;
	}
	
	public static void main(String[] args) {
		
		
				
				
		int bouns = SalesSimulator.calculateBonus(200, 3);
		System.out.println(bouns);
	}
}
