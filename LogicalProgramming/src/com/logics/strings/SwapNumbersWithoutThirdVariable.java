package com.logics.strings;

public class SwapNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		
		int a=110;
		int b=150;
		int sum=a+b;
		System.out.println("Before swap ..."+a+".."+b);
		 b = sum-b;   
		 a = sum-a;
		 
	System.out.println("After swap ..."+a+".."+b);

         
	}

}
