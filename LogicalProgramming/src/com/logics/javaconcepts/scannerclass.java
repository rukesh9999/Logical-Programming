package com.logics.javaconcepts;

import java.util.Scanner;

public class scannerclass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter string");
		System.out.println(scan.nextLine());
		System.out.println(scan.nextInt());
		String s = scan.next();
		
		//System.out.println(scan.nextLine());
	}
}
