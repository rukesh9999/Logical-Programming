package com.logics.array;

public class SecondMinElement {

	public static void main(String[] args) {
		
		int[] array = new int[]{10,9,1,3,2,5,6,8,4,7};
		
	    int min=array[0];
	    int secmin=array[1];
		for(int element : array)
		{
			if(element<min)
			min = element;
			
		}
		
		
		for(int element : array)
		{
			if(element>min && element<secmin)
			{
				secmin=element;
			}
			
		}
		
		System.out.println(min);
		System.out.println(secmin);
		
		
	}
}
