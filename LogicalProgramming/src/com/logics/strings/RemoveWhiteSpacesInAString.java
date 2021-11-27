package com.logics.strings;

public class RemoveWhiteSpacesInAString {

	public static void main(String[] args) {
		String words="Iam CustomArrayListMain Fan Of virat";
		System.out.println(words);
		String rwstr = removewhitespaces(words);
		System.out.println(rwstr);
		
	}

	private static String removewhitespaces(String words) {
		String[] rwwords = words.split(" ");
		String finalword="";
		for(String str:rwwords)
		{
			finalword=finalword+str;
		}
		
		return finalword;
	}
}
