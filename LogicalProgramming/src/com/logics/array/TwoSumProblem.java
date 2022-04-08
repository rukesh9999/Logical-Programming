package com.logics.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
	 
	public static void main(String[] args) {
		int[] arr = {2,4,5,6,8,3};
		//int[] arr = {0,4,1,7,3,3};
		long start = System.currentTimeMillis(); 
		int[] res = solveTwoSumProblem(arr);
		long end= System.currentTimeMillis(); 
		System.out.println(Arrays.toString(res));
		System.out.println("time taken to  calculate  ...." + 
	            (end - start)   + "ms"); 
		
		
		long startm = System.currentTimeMillis(); 
		int[] res2 = twoSumProblemUsingMap(arr);
		long endm= System.currentTimeMillis(); 
		System.out.println(Arrays.toString(res2));
		System.out.println("time taken to  calculate using map ...." + 
	            (endm - startm)   + "ms"); 
	}

	
	/**
	 * 
	 * @param arr
	 * @return
	 */
	private static int[] twoSumProblemUsingMap(int[] arr) {
		
		int res=9;
		int[] resultarr=new int[2];
		Map<Integer, Integer> map =new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			if(!map.containsKey(res-arr[i]))
			map.put(arr[i], i);
			
			else
			{
				resultarr[1]=i;
				resultarr[0]=map.get(res-arr[i]);
				return resultarr;
			}
			
				
			
		}
		
		
		
		return resultarr;
	}

	private static int[] solveTwoSumProblem(int[] arr) {
		int res=9;
		int[] resultarr= new int[2];
		for(int a=0;a<arr.length;a++) {
			for(int j=a+1;j<arr.length;j++)
			{
				int val = arr[a]+arr[j];
				if(val==res)
				{
					resultarr[0]=a;
					resultarr[1]=j;
					return resultarr;
				}
				
			}
		}
		return resultarr;
	}

	
}
