package com.logics.array;

public class ReverseAnArray {
	
public static void main(String[] args) {
	Integer[] arr = {8,7,1,2,4,6,5,0};
	System.out.println("Before Reverse...");
	for(Integer arr1: arr)
	{
		System.out.print(arr1);
	}
	Integer[] array= reverse(arr,0,arr.length-1);
	System.out.println();
	System.out.println("After Reverse...");
	for(Integer arr1: array)
	{
		System.out.print(arr1);
	}
}


   public static Integer[] reverse(Integer[] arr,int Startindex,int endindex)
   {
	
      int start_index=Startindex;
      int end_index=endindex;
      
      while(start_index<end_index)
      {
    	  int temp=arr[start_index];
    	  arr[start_index] = arr[end_index];
    	  arr[end_index]=temp;
    	  start_index++;
    	  end_index--;
    	 
      }
     
       return arr;
   }
	
}
