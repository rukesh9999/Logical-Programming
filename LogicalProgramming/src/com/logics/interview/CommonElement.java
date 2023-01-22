package com.logics.interview;

import java.util.LinkedHashMap;
import java.util.Map;

public class CommonElement {
	// {  {2, 1, 4, 3},
      //   {1, 2, 3, 2},  
        // {3, 6, 2, 3},  
         //{5, 2, 5, 3}  }
	
	public static void main(String[] args) {
		
		int mat[][] = {  {12, 1, 14, 3, 16},
                {14, 2, 1, 3, 35},
                {14, 1, 14, 3, 11},
                {14, 25, 14, 14, 14},
                {1, 18, 3, 21, 2} };
                
		Map<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<mat.length;i++) {
			
			for(int j=0;j<mat.length;j++) {
				
				if(!map.containsKey(mat[i][j]))
				map.put(mat[i][j], 1);
				else
				map.put(mat[i][j],map.get(mat[i][j])+1);
				
			
			}
		}
                
          System.out.println(map);  
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			
			  if(entry.getValue()>=5)
			  System.out.println(entry.getKey());	  
				  
		}
	}
}
