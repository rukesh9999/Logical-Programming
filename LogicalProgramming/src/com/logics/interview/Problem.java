package com.logics.interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Problem {

	
	public static void main(String[] args) {
		
		/*
		 * int arr[][] ={ {1,2,3}, {4,5,6}, {7,8,9} };
		 */
		
		
		int arr[] = {10,5,17,12,11,1,18};
		
		Map<String,Integer> map = new LinkedHashMap<>();	
		
		
	  for(int i=0;i<arr.length;i++) {
		  
		  for(int j=i+1;j<arr.length;j++) {
			  
			  for(int k=j+1;k<arr.length;k++) {
				  
				  System.out.println(arr[i]+"..."+arr[j]+"..."+arr[k]);
				  
				  String key = arr[i]+"..."+arr[j]+"..."+arr[k];
				  int ele[] = new int[3];
				  ele[0]=arr[i];
				  ele[1]=arr[j];
				  ele[2]=arr[k];
				  
				   int min = Problem.findMin(ele);
				   int max = Problem.findMax(ele);
				   
				   int differnece = max-min;
				   System.out.println(differnece);
				   
				   map.put(key, differnece);
				   
				   
			  }
		  }
		  
	  }
		
		
	  
	  System.out.println(map);
	  
	  LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted(Entry.comparingByValue())
	  .collect(Collectors.toMap(Entry::getKey,Entry::getValue,(o1,o2)->o1,LinkedHashMap::new));
	  
	  System.out.println(collect);
		
	}
	
	
	
	public static int findMin(int arr[]){
		
		int min=0;
		for(int g=0;g<arr.length;g++) {
			
			if(arr[g]<min)
			min=arr[g];
			
		}
		
		
		return min;
	}
	
	
	
   public static int findMax(int arr[]){
		
		int max=0;
		for(int g=0;g<arr.length;g++) {
			
			if(arr[g]>max)
			max=arr[g];
			
		}
		
		return max;
	}
	
}
