package com.logics.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortArrayBasedOnQuantity {

	public static void main(String[] args) {
	

		Integer[] array =new Integer[]{10,10,2,2,2,2,3,4,5,8,8,9,9,9,7,7,7,7,3};
		
		Integer[] temparr = new Integer[array.length];
		
		Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        
        Map<Integer,Integer> map =new LinkedHashMap<>();
        
        for(Integer i:array)
        {
        	if(map.get(i)==null)
        	{
        		map.put(i, 1);
        	}else {
        		
        		map.put(i, map.get(i)+1);
        	}
        }      
        System.out.println(map);
        
//        Map<Object, Object> sortedMap=null;
//    	
//    	sortedMap = map.entrySet().stream()
//    	.sorted((val1,val2)->
//    	val1.getValue()
//    	.compareTo(val2.getValue()))
//    	.collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
        List<Entry<Integer, Integer>> sortedEntries=null;
        
     
        	
        sortedEntries = map.entrySet().stream()
        	.sorted((entry1,entry2)->entry2.getValue().compareTo(entry1.getValue())).collect(Collectors.toList());
        System.out.println("sorted map"+sortedEntries);
        int count=0;
        
        
      for(Entry<Integer, Integer> entry :sortedEntries)
      {
    	 
    	  for(int i=0;i<entry.getValue();i++)
    	  {
    		  temparr[count]=entry.getKey();
    		  count++;
    	  }
    	  
      }
          
          
          
          
        System.out.println("temp array..........."+Arrays.toString(temparr));
        
	}
		
}
