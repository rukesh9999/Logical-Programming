package com.logics.strings;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AnagramStrings {

	public static void main(String[] args) {
		
		String str1="java";
		String str2="jvaa";
		
		List<String> list1 = Arrays.asList(str1.split("")).stream().sorted().collect(Collectors.toList());
		
		List<String> list2 = Arrays.asList(str2.split("")).stream().sorted().collect(Collectors.toList());
		
		if(list1.equals(list2))
		System.out.println("both are anagram");
		else
		System.out.println("both are not anagram");
		
	}
}
