package com.logics.javaconcepts;

public class DuplicateSingletonUsingCloning {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException {
 
		 Singleton instance1 = Singleton.getInstance();
		 Singleton instance2 = (Singleton) instance1.clone();
		 
		 
			System.out.println("instance1....."+instance1.hashCode());
			System.out.println("instance2....."+instance2.hashCode());

			
      
	}

}
