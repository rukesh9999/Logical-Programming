package com.logics.strings;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=20;
		int b=10;
		System.out.println("Before swap ..."+a+".."+b);
		 a = (a*b)/a;   
		 b = (a*b)/(a+b);
		 
	System.out.println("After swap ..."+a+".."+b);

         
	}

}
