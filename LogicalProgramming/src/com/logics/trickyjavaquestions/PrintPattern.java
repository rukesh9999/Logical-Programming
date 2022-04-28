package com.logics.trickyjavaquestions;

public class PrintPattern {

	public static void main(String[] args) {
		
		String str1="JAVAJ2EE";
		
		for(int i=0;i<str1.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(str1.charAt(j));
			}
			System.out.println();
		}
	}
}
