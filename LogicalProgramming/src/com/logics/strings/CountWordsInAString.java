package com.logics.strings;

public class CountWordsInAString {

	public static void main(String[] args) {
		String words="Iam CustomArrayListMain Virat Fan";
		int count = CountWords(words);
		System.out.println(count);
		
	}

	private static int CountWords(String words) {
		int count=0;
		String[] countwords = words.split(" ");
		for(@SuppressWarnings("unused") String str : countwords)
		{
			count++;
		}
		
		return count;
	}



	
}
