package com.logics.javaconcepts;

public class CloningMain {

	
	public static void main(String[] args) throws CloneNotSupportedException {
		
	Address address= new Address(521325, "gudlvalleru", "AP");
	
	Person p1 = new Person(101, "rukesh", "rukesh235@gmail.com", address);
	
	Person p2 = (Person) p1.clone();
	
	p2.setEmail("abc@gmail.com");
	p2.getAddress().setCity("guntur");
	
	System.out.println(p1);
	System.out.println(p2);
	
	
	}
}
