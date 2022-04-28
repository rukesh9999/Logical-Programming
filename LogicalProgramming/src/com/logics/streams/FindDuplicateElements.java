package com.logics.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet();
	    List<Integer> asList = Arrays.asList(1,4,4,3,2,1);
		
	     List<Integer> collect = asList.stream().filter(n->!set.add(n)).collect(Collectors.toList());
   
	      System.out.println(collect);
	
	}
	
}
