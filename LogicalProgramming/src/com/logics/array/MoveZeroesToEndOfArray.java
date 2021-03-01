package com.logics.array;

public class MoveZeroesToEndOfArray {

	public static void main(String[] args) {
		int[] arr= {0,1,1,0,0,0,1,0,1,1,1,1,1,1};
		System.out.println("before moved..");
		
		for(int a : arr)
		{
			System.out.print(a);
		}

		int[] sortarr = moveZeroesToEnd(arr);
		System.out.println();
		System.out.println("after moved..");
		for(int a : sortarr)
		{
			System.out.print(a);
		}

	}

	private static int[] moveZeroesToEnd(int[] arr) {
 
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			
			while(arr[i]!=0 && arr[j]==0)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				//j++;
			}
			
			if(arr[j]!=0)
			{
				j++;
			}
		}
		
		
		return arr;
	}

}
