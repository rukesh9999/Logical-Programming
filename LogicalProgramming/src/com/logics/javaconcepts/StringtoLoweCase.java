package com.logics.javaconcepts;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringtoLoweCase {

	public static void main(String[] args) {
		
	
	String str="JAVA";
	
	Predicate<String> predicate= s->s!=null && !s.equals("") && !s.equalsIgnoreCase("null");
	
	Function<String, String> function = String::toLowerCase;
	
	if(predicate.test(str)) {
		
		String lowercasestr = function.apply(str);
		System.out.println(lowercasestr);
	}
	
	
	
	}
	
}
