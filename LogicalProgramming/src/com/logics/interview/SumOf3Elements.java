package com.logics.interview;

public class SumOf3Elements {

	//array = {12, 3, 4, 1, 6, 9}, sum = 24; 

	public static void main(String[] args) {
		
		
		int arr[]= {12,3,4,1,6,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				 for(int k=j+1;k<arr.length;k++) {
					 int sum = arr[i]+arr[j]+arr[k];
					// System.out.println("sum........"+sum);
					 if(sum==24)
					 System.out.println(arr[i]+"..."+arr[j]+"..."+arr[k]);
				 }
			}
		}
		
		
		
		
		
	}
	
}
