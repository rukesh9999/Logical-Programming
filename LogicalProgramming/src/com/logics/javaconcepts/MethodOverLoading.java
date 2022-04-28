package com.logics.javaconcepts;

public class MethodOverLoading {

	public void fun(Object obj) {
		System.out.println("object ");
	}
	
	public void fun(Integer i) {
		System.out.println("integer");
	}
	
	public void fun(String s) {
		System.out.println("String");
	}
	
	private static int $;
	
	
	public static void main(String[] args) {
		
		MethodOverLoading mo= new MethodOverLoading();
		String i=null;
		mo.fun(i);
		
		String a_b;
		//System.out.println(a_b);//CTE local variable must be initialized
		System.out.println($);
		
		
	}
}
