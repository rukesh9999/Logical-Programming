package com.logics.array;

public class FindMinValInArray {
public static void main(String[] args) {
	//Integer[] intarr = {1,12,4,7,2,6};
	Integer[] intarr = {1000,1200,1400,1700,2000,1600};
	int val = findminval(intarr);
	System.out.println("min value...."+ val);
}

private static int findminval(Integer[] intarr) {
	
	
	if(intarr==null)
	throw new IllegalArgumentException("invalid input");
		
	Integer[] arr=intarr;
	int min =arr[0];
	int count=0;
	for(int val :arr)
	{  
		if(val<min)
		min=arr[count];
		count++;
		
	}
	
	return min;
}
}
