package com.logics.array;

import java.util.Arrays;

public class ReverseEveryThreeNumbersInAnArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<arr.length-1;i++) {
			
			int temp=arr[i];
			arr[i]=arr[i+2];
			arr[i+2]=temp;
			i+=2;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
