package com.logics.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharacter {

	public static void main(String[] args) {
		
		String str="Java Hungry Blog Alive is Awesome";
		
		String string = Arrays.asList(str.split(""))
		.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream()
		.filter(entry->entry.getValue()==1)
		.map(entry->entry.getKey())
		.findFirst()
		.get();
		
		System.out.println(string);
	}
}
