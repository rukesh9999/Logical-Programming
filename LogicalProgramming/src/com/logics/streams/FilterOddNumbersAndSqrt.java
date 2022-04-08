package com.logics.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterOddNumbersAndSqrt {

	public static void main(String[] args) {
		
		 List<Integer> asList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 Predicate<Integer> predicate=i->i%2!=0;
		 Function<Integer,Integer> function= i->i*i;
		 List<Integer> collect = asList.stream().filter(predicate).map(function).collect(Collectors.toList());
	     System.out.println(collect);
		// collect.forEach(System.out::print);
	     
	  String s="abcdabcde";
	  List<String> list = Arrays.asList(s.split(""));
	  Map<String, Long> map = list.stream()
			  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	  
	  for(Map.Entry<String,Long> entry : map.entrySet()) {
		   if(entry.getValue()==1)
		   {
			   System.out.println(entry);
		   }
	  }
	  
	  
	
	}
}
