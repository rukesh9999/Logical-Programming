package com.logics.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MoveNegitiveNumbersToEndOfArray {

	public static void main(String[] args) {
		
		int arr[]= {2,6,-7,9,-6,-4,0,2,-3};
		
		Integer[] sortedArray = Arrays.stream(arr).boxed().sorted(Collections.reverseOrder(Comparator.comparingInt(Integer::intValue)))
				.toArray(Integer[]::new);

        System.out.println(Arrays.toString(sortedArray));
	}		

}
