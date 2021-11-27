package com.logics.javaconcepts;

public class ExceptionTest {

	public static void main(String[] args) {
		
		
		try {
			int a=10;
			
			System.out.println("try");
			System.out.println("value..."+a/0);
			//throw new RuntimeException();
		
			
		}catch (Exception e) {
			System.out.println("catch");
		}
		
		finally {
			System.out.println("finally");
		}
		System.out.println("returning");
	}
}
