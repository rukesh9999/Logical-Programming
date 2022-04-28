package com.logics.array;

public class FindFirstAndSecLargestNumber {
	public static void main(String[] args) {
		
		int[] arr = {2,6,7,8,9,100,0,99};
		
		int largest=0;
		int secLargest=0;
		for(int number : arr) {
			
			if(number>largest) {
				secLargest=largest;
				largest=number;
			}else if(number>secLargest) {
				secLargest=number;
			}
		}
		
		System.out.println("Largest Number is  "+largest);
		System.out.println("Second Largest Number is "+secLargest);
		
	}

}
