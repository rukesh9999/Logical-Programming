package com.logics.array;

import java.io.IOException;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int number = Integer.parseInt(sc.next());
		if(number==0 || number==1) {
			System.out.println("Given number is  not a Prime");
		}
		for(int i=2;i<=number/2;i++) {
			
			if(number%i==0) {
				System.out.println("Given Number is a Not a Prime");
				return;
			}
		}
		
		
		
		System.out.println("Given Number is a Prime");
		
	}
}
