package com.logics.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfElements {

	public static void main(String[] args) {
		
		
		List<Integer> asList = Arrays.asList(1,2,3,4,5,6,6,5,4,1);
		
		int sum = asList.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		
		
		long collect = asList.stream().collect(Collectors.summarizingInt(Integer::intValue)).getSum();
		System.out.println(collect);
		
		Integer reduce = asList.stream().reduce(0,Integer::sum);
		System.out.println(reduce);
		
		long count = asList.stream().mapToInt(Integer::intValue).count();
		System.out.println(count);
		
		long count2 = asList.stream().mapToInt(Integer::intValue).distinct().count();
		System.out.println(count2);


	}
}
