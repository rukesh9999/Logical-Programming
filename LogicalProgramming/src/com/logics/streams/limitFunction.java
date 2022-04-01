package com.logics.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class limitFunction {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<100000;i++)
		{
			list.add(i);
		}
		list.forEach(System.out::println);
System.err.println("........limit ...............");
		
		Stream<Integer> limit = list.stream().limit(10);
		limit.forEach(System.out::println);
		System.err.println("........skip ...............");

		Stream<Integer> limit2 = list.stream().skip(2).limit(8);
		limit2.forEach(System.out::println);
	}
}
