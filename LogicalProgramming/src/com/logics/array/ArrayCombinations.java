package com.logics.array;

import java.util.Arrays;

public class ArrayCombinations {

	public static void main(String[] args) {
		
		Integer[] arr = new Integer[] {1,2,3,4,5,6};
		Integer[] temparr =new Integer[4];
		
		int count=0;
		int gblcnt=0;
		int elementsCount=4;
		int maxLimit=24;
		for(int i=0;i<arr.length;i++)
		{ 
			
			
							
			if(count<=elementsCount)
			{
				temparr[count]=arr[i];
			}
			
			if(i==arr.length-1)
			{
				i=-1;
			}
				
			count++;
			gblcnt++;
			
			if(gblcnt>=maxLimit)
			{
				break;
			}
			
			if(count>=elementsCount) {
				count=0;
                System.out.println(Arrays.toString(temparr));
				
			}
						
		}
			
		
		
		// 1 2 3 4 5 6
		
	}
}
