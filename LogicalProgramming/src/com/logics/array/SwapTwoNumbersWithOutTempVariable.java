package com.logics.array;

import java.util.Scanner;

public class SwapTwoNumbersWithOutTempVariable {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value:::::");
	    int a_value = Integer.parseInt(sc.next());
	    System.out.println("Enter b value::::");
	    int b_value = Integer.parseInt(sc.next());
	    System.out.println("Before Swapping a value is  "+a_value +" b value is "+b_value);
	    int sum = a_value+b_value;
	    b_value = sum-b_value;
	    a_value = sum-a_value;
	    
	    System.out.println("After swapping a value is "+a_value+" b value is "+b_value);
	    
		Integer i = new Integer(10);
		
		
		
	}
}
