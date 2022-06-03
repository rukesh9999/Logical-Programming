package com.logics.array;

public class LinearSearch {

	public static void main(String[] args) {
		
		int arr[] = {1,8,0,3,6,7};
		int searchElement=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==searchElement) {
			
				System.out.println("Element found at "+i);
			}
			
		}
		
		
	}
}
