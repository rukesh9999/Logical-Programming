package com.logics.strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		
		  Scanner scanner =new Scanner(System.in);
		  System.out.println("Enter a String "); String originalString =
		  scanner.next(); System.out.println(originalString); String reverseString="";
		  
		  // System.out.println("chararray"+Arrays.toString(chararr));
		  
		  for(int i=originalString.length()-1;i>=0;i--) {
		  //System.out.println(chararr[i]);
		  
		  reverseString+=originalString.charAt(i); }
		  
		  
		  
		  
		  System.out.println(reverseString);
		  
		 

	}
}
