package com.logics.array;

public class PrintDuplicatesWithOutHashMapORSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,5,7,8,9,1,5,7,9};
		
		 System.out.print("Duplicate Elements are....");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
			
				 if(arr[i]==arr[j]) {
					 System.out.print(" "+arr[j]);
				 }
		   		
			}
		}
		
		
		
	}

}
