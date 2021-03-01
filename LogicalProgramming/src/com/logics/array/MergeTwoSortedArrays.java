package com.logics.array;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,5,14,15,26,29,33,88,99};
		int[] arr2= {3,6,11,18,23,40,55,77,90};
		long start = System.currentTimeMillis(); 	    
		int[] finalarr = merge(arr1,arr2);
		System.out.println(Arrays.toString(finalarr));
	    long end = System.currentTimeMillis(); 
		System.out.println("time taken to  calculate..... " + 
                   (end - start) + "ms"); 
		
		long startm = System.currentTimeMillis(); 	    
		int[] finalarrm = sortedmerge(arr1,arr2);
	    long endm = System.currentTimeMillis(); 
	    System.out.println(Arrays.toString(finalarrm));
		System.out.println("time taken to  calculate  sorted...." + 
                   (endm - startm) + "ms"); 
		
	}

	private static int[] sortedmerge(int[] arr1, int[] arr2) {
       int i=0;
       int j=0;       
       int k=0;       
       int[] newarr= new int[arr1.length+arr2.length];
    	while(i<arr1.length && j<arr2.length){	   
		if(arr1[i]<arr2[j])
		{
			newarr[k]=arr1[i];
			k++;
			i++;
		}
		else {
			newarr[k]=arr2[j];
			j++;
			k++;
		}
     }
    	
    	while(i<arr1.length)
    	{
    		newarr[k]=arr1[i];
			k++;
			i++;
    	}
    	while(j<arr2.length)
    	{
    		newarr[k]=arr2[j];
			j++;
			k++;
    	}
	 	
		return newarr;
	}

	private static int[] merge(int[] arr1, int[] arr2) {
	
		int cnt=0;
		int length=arr1.length+arr2.length;
		int[] newarr =new int[length];
		for(int a:arr1)
		{
			newarr[cnt]=a;
			cnt++;
		}
		
		for(int b:arr2)
		{
			newarr[cnt]=b;
			cnt++;
		}
		return newarr;
	}
	
	
	
	
	
}
