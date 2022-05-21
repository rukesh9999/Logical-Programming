package com.logics.streams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestSubString {
	
	public static void main(String[] args) {
		
	
	String str="java";

	Map<String,Integer> map = new LinkedHashMap();
	for(int i=0;i<str.length();i++) {
		
		for(int j=i+1;j<=str.length();j++) {
			
			String substr =  str.substring(i,j);
			//System.out.println(substr);
			if(!map.containsKey(substr))
			map.put(substr,1);
			else
			map.put(substr, map.get(substr)+1);
		}
	}
	
      
 System.out.println(map);
	
 List<String> list = map.entrySet().stream()
	.filter(entry->entry.getValue()==1)
	.map(entry->entry.getKey())
	.sorted((s1,s2)->Integer.compare(s2.length(), s1.length()))
	.limit(1)
	.collect(Collectors.toList());
     System.out.println(list);
	 
	
	}
}
