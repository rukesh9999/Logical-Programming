package com.logics.array;

public class RemoveDuplicateElementsWithOutHashMapORSet {

	public static void main(String[] args) {
		
		int[] arr = {1,5,7,8,9,1,5,7,9};
		
		int arraywithoutduplicates = arr.length;
		
		for(int i=0;i<arraywithoutduplicates;i++) {
			for(int j=i+1;j<arraywithoutduplicates;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[arraywithoutduplicates-1];
					arraywithoutduplicates--;
					j--;
					
				}
			}
		}
		
		System.out.println("After removing duplicates");
		
		for(int i=0;i<arraywithoutduplicates;i++) {
			
			System.out.print(" "+arr[i]);
		}
		
	}

}
