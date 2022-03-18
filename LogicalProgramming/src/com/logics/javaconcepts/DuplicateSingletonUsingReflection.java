package com.logics.javaconcepts;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


public class DuplicateSingletonUsingReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		
		      Singleton instance1 = Singleton.getInstance();
			  System.out.println("instance1....."+instance1.hashCode());

		      Singleton instance2 =null;
		      
		      Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();
		      
		      for(Constructor constructors : declaredConstructors)
		      {
		    	  constructors.setAccessible(true);
		    	  instance2 = (Singleton) constructors.newInstance();
		    	  break;
		      }
		      
		  
		      
			System.out.println("instance2....."+instance2.hashCode());
	}

}
