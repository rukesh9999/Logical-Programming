package com.logics.javaconcepts;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamAPI {

	
	public static void main(String[] args) {
		
		Integer[] ints =new Integer[]{10,10,20,10,12,12,5,55,55,66,66};
		
		
		//System.out.println(ints);
		
		List<Integer> listOfIntegers = Arrays.asList(ints);
		
		List<Integer> result = listOfIntegers.stream().filter(i->i>0).distinct().collect(Collectors.toList());
		
		System.out.println("....before.....");
		listOfIntegers.forEach(System.out::println);
		
		System.out.println("....after.....");
		result.forEach(System.out::println);
		
		Random random = new Random();
		random.ints().limit(1).sorted().forEach(System.out::println);
		
		Map<Character,Integer> map =new LinkedHashMap();		
		
		
	}
}
