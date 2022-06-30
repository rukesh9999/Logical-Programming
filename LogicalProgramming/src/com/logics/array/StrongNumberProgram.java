package com.logics.array;

public class StrongNumberProgram {

	public static void main(String[] args) {
		
		
		int number =145;
		int tot=0;
		int temp=number;
		while(number>0) {
			
			int rem = number%10;
			number = number/10;
			
			int fact=1;
			
			for(int i=1;i<=rem;i++) {
				
				fact=fact*i;
			}
			
			tot+=fact;
		}
		
		if(tot==temp) 
		System.out.println("Given Number is Strong Number");
		else
		System.err.println("Given Number is Not a Strong Number");
			
		
		
	}
}
