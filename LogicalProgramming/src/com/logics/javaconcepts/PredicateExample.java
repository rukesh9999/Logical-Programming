package com.logics.javaconcepts;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		PredicateExample.evaluate(list,n->n%2==0);
		
		
	}

	private static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		
		for(Integer n:list) {
			
			if(predicate.test(n))
			{
				System.out.println("even number......"+n);
			}
		}
		
	}
}
