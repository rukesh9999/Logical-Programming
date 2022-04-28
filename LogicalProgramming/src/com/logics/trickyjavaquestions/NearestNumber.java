package com.logics.trickyjavaquestions;

import java.util.Scanner;

public class NearestNumber {

	
	public static int nearestNumber(int number1,int number2,int exactNumber)
	{
		int diff1 = exactNumber-number1;
		
		int diff2 = exactNumber-number2;
		
		if(diff1<diff2)
		return number1;
		
		else if(diff2<diff1)
		return  number2; 
		
		
		return diff1;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		int number=100;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number1");
		int number1  = Integer.parseInt(sc.next());
		System.out.print("Enter a number2");
		int number2  = Integer.parseInt(sc.next());
		 
		
		 
		
		int nearestNumber = NearestNumber.nearestNumber(number1, number2,number);
		System.out.println("nearest number to 100 ...."+nearestNumber);
	}
}
