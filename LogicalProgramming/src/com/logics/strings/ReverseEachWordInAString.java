package com.logics.strings;

import java.util.Arrays;

public class ReverseEachWordInAString {
 public static void main(String[] args) {
	 String words="Iam a Great Fan Of Virat";
	 String[] reverseword = reverse(words);
	 System.out.println(Arrays.toString(reverseword));
}

private static String[] reverse(String words) {
	
	String[] word=words.split(" ");
	System.out.println(Arrays.toString(word));
	int startIndex=0;
	int endIndex=word.length-1;
	while(startIndex<endIndex)
	{
		String temp=word[startIndex];
		word[startIndex]=word[endIndex];
		word[endIndex]=temp;
		startIndex++;
		endIndex--;
	}
	return word;
}
	
}
