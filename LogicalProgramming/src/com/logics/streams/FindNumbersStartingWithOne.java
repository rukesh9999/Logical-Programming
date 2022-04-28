package com.logics.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartingWithOne {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(11,15,2,2,3,3,14,4);
		List<String> collect = asList.stream().map(s->s+"").filter(s->s.startsWith("1"))
				.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
