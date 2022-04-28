package com.logics.streams;

import java.util.Arrays;
import java.util.List;

public class MaxNumber {

	public static void main(String[] args) {
		
		List<Integer> asList = Arrays.asList(1,3,8,9,2,6);
		
		Integer max = asList.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}
