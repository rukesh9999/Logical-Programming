package com.logics.streams;

import java.util.stream.Stream;

public class FindFirstAndFindAny {

	public static void main(String[] args) {
		
		Stream.of("one","two","three","four")
		.findAny()
		.ifPresent(System.out::println);
		
		
		
		Stream.of("one","two","three","four")
		.parallel()
		.findAny()
		
		.ifPresent(System.out::println);
		
	}
}
