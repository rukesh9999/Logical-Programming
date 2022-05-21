package com.logics.array;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		int num=953388;
		
		  
		 
		 int count=0;
		 while(num>0) {
			 
			 int rem = num%10;
			 num=num/10;
			 
			 if(count==0 || count==5)
			 System.out.println(rem);
			 
			 
			 
			 count++;
		 }
		
		
		
		
	}

}
