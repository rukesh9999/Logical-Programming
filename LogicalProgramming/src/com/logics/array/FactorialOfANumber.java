package com.logics.array;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a  number ");
		int number = Integer.parseInt(sc.nextLine());
		
		int fact=1;
		for(int i=number;i>=1;i--) {
			fact=fact*i;
			
		}
		
		
		System.out.println("factorial of a number is ........"+fact);
		
	}
}
