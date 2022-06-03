package com.logics.array;

public class BinarySearch {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5,6,7};
		
		int first=0;
		int last=arr.length;
		int mid= (first+last)/2;
		int searchElement =1;
		
		while(first<=last)
		{
			if(searchElement<arr[mid])
			{
				last=mid-1;
			}else if(searchElement==arr[mid]) {
				System.out.println("Element found at "+mid);
				break;
			}else {
				first=mid+1;
			}
			
			mid = (first+last)/2;
		}
		if(first>last)
		System.out.println("Element found at "+mid);
	}
}
