package com.logics.array;

public class FindSumOfFirstAndLastDigitInANumber {
	
	public static void main(String[] args) {
		
		
		
		int num=953388;
		int temp=num;
		int digit =0;
		  
		 while(num>0) {
			 
			 digit = num%10;
			 num=num/10;
			 
		 }
		
		 int rem = temp%10;
		 System.out.println(rem);
		 System.out.println(digit);
		 System.out.println(rem+digit);
		
		
	}

}
