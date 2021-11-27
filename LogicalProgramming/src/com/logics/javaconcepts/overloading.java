package com.logics.javaconcepts;

public class overloading {
	public static void main(String[] args) {
      
		Parent1 parent1 = new  Child1();
		parent1.parent();
		
		Child1 child1 = (Child1) new Parent1();
		child1.parent();
		child1.parent(1);
	}
}

class Parent1 {
	public void parent() {
		System.out.println("from parent");
	}

}

class Child1 extends Parent1 {
	public void parent(int i) {
		System.out.println("from child");
	}

}
