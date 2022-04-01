package com.logics.array;

import java.util.Arrays;

public class SortZerosAndOnes {

	public static void main(String[] args) {
    
		int[] array = new int[] {0,0,1,1,0,1,0,1,1,0,0};
		
		int startIndex=0;
		int endIndex=array.length-1;
		
		while(startIndex<endIndex)
		{
			if(array[startIndex]>array[endIndex]) {
			int temp=array[startIndex];
			array[startIndex]=array[endIndex];
			array[endIndex]=temp;
			startIndex++;
			}else if(array[startIndex]==array[endIndex]  && array[startIndex]>0){
			 endIndex--;
			}
			else {
				startIndex++;
			}
					
		}
		
		System.out.println(Arrays.toString(array));
	}
}
