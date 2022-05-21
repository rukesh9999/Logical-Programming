package com.logics.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastDigitOfGivenNumber {

	static final int aa = 10;
	
	public static void main(String[] args) {
		
		int[] array = new int[] {1,2,3,4,5,6,7,8};
		
		int startIndex=0;
		int endIndex=array.length-1;
		
		while(startIndex<endIndex)
		{
			int temp=array[startIndex];
			array[startIndex]=array[endIndex];
			array[endIndex]=temp;
			startIndex++;
			endIndex--;
					
		}
		
		System.out.println(Arrays.toString(array));
		
		
		String str1="java";
		
		String str2 = new String("java");
		System.err.println("======string=====");

		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		StringBuffer sb1 = new StringBuffer("java");
		StringBuffer sb2 = new StringBuffer("java");
		
		StringBuilder sbb1 =new StringBuilder("java");
		StringBuilder sbb2 =new StringBuilder("java");
		
		System.err.println("=====string buffer=========");
		System.out.println(sb1==sb2);

		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.hashCode()==sb2.hashCode());
		
		
		final int a;
		a=10;
		
final List<Integer> list = new ArrayList<>();
list.add(10);


System.out.println(list);
	}
	
}
