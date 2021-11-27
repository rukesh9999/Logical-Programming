package com.logics.javaconcepts;

public class Parent {
  static {
	  
	  System.out.println("parent static block");
  }
  
  
   public static int p=10;
   public static void main(String[] args) {
	 
	   System.out.println(" ..... "+Parent.p);
 }
}
