package com.logics.javaconcepts;

import java.util.LinkedHashSet;
import java.util.Set;

public class Challange1 {

	 private Integer id;
	 
	 
	
	
	 public Challange1(Integer id) {
		super();
		this.id = id;
	}


  

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}




	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}




	@Override
	public String toString() {
		return "Challange1 [id=" + id + "]";
	}




	public Integer getId() {
		return id;
	}




	public void setId(Integer id) {
		this.id = id;
	}




	public static void main(String[] args) {
		
		/*
		 * if(System.out.print("HI\nHello\nBye")!=null) {
		 * 
		 * }
		 */
			

		Challange1 c1 =new Challange1(1);
		
		Challange1 c2 =new Challange1(2);
		
		Challange1 c3 =new Challange1(3);
		
		Challange1 c4=new Challange1(4);
		Challange1 c5 =new Challange1(5);
		Challange1 c6 =new Challange1(6);
		Challange1 c7 =new Challange1(7);
		
		 
		Set<Challange1> set = new LinkedHashSet<Challange1>();
		set.add(c1) ;
		set.add(c2) ;
		set.add(c3) ;set.add(c4) ;set.add(c5) ;set.add(c6) ;set.add(c7) ;
		
		
		set.stream().limit(6).forEach(System.out::println);
		
		
		
		 
		 
	 }
}
