package com.logics.streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortHashMapByKey {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("sanjay", 11);map.put("bharani", 13);
		map.put("ravi", 7);	map.put("ajay", 8);	
		map.put("zunad", 2);map.put("shaya", 9);	
		map.put("alia", 5);	map.put("ragav", 1);	
		
		
		Map<String, Integer> collectreverseMap = map.entrySet().stream().sorted(Collections.reverseOrder(Entry.comparingByValue()))
		.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
		
		System.out.println(collectreverseMap);

		Map<String, Integer> collectMap = map.entrySet().stream().sorted(Entry.comparingByValue())
				.collect(Collectors.toMap(Entry::getKey,Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
				
		System.out.println(collectMap);
		
		
		
		
	}
	
}
