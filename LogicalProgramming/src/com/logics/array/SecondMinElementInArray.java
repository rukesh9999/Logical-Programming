package com.logics.array;

public class SecondMinElementInArray {

	public static void main(String[] args) {
		
		Integer[] array = new Integer[] {6,7,9,3,2,5,4,8};
		Integer min =array[0];
		Integer secmin =array[1];
		for(Integer element : array)
		{
			if(min>element)
			{
				min = element;
			}
			
		}
		
		for(Integer element : array)
		{
			if(min<element && secmin>element)
			{
				secmin=element;
			}
		}
		
		System.out.println("min value     "+min);
		System.out.println("min value     "+secmin);
		
	}
}
