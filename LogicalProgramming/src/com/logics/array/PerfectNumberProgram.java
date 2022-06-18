package com.logics.array;

import java.util.Scanner;

public class PerfectNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number  = sc.nextInt();
		int remSum=0;
		for(int i=1;i<=number/2;i++) {
			
			if(number%i==0) {
				
				remSum+=i;
			}
			
		}
		
		if(remSum==number)
		System.out.println("Given Number is a Perfect Number");
		else
		System.out.println("Given Number is not a Perfect Number");
	}

}
