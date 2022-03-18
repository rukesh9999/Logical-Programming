package com.logics.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SortMain {
 
	public static void main(String[] args) {
		
		
		List<Clear> clearList =new ArrayList<>();
		
		clearList.add(new Clear("nani", "g", 1));
		clearList.add(new Clear("ravi", "o", 2));
		clearList.add(new Clear("nani", "i", 3));
		clearList.add(new Clear("rukesh", "j", 4));
		clearList.add(new Clear("sheela", "h", 5));
		clearList.add(new Clear("alex", "s", 6));
		
		Collections.sort(clearList,new Comparator<Clear>() {

			@Override
			public int compare(Clear o1, Clear o2) {
				// TODO Auto-generated method stub							
				return o1.getLastName().compareTo(o2.getLastName());
			}
		
		});
	
		clearList.forEach(clear-> System.out.println(clear));
		
		System.out.println("=======================");
		List<Clear> collect = clearList.stream().sorted((c1,c2)->c1.getLastName().compareTo(c2.getLastName()))
		.collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	}
	
}
