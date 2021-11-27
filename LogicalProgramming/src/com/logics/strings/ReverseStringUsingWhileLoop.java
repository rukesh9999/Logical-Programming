package com.logics.strings;

public class ReverseStringUsingWhileLoop {

	
	public static void main(String[] args) {
		
		String str="java";
		char ch[] =  str.toCharArray();
		int starindex=0;
		int endindex=ch.length-1;
		
		while(starindex<endindex)
		{
			 char ch1 = str.charAt(starindex);
			 char ch2 = str.charAt(endindex);
			 
			 if(ch[starindex]==ch[endindex])
			 {
				 starindex++;
				 endindex--;
				 continue;
			 }else
			 {

					System.out.print("No");
			 }
			
		}
		
		System.out.print("Yes");
	}
}
