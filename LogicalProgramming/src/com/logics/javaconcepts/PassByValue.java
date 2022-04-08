package com.logics.javaconcepts;

public class PassByValue {

	int data=50;
	
	public void call(int data) {
		data=data+100;
	}
	
	
	public static void main(String[] args) {
		PassByValue passByValue = new PassByValue();

		System.out.println(passByValue.data);
		passByValue.call(500);
		System.out.println(passByValue.data);
	}
}
