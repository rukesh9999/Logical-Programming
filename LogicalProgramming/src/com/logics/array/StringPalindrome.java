package com.logics.array;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		long start = System.currentTimeMillis(); 	
        boolean flag = stringPalindrome(str);
        long end= System.currentTimeMillis(); 
        System.out.println("time taken to  calculate  ...." + 
                (end - start)   + "ms"); 
        System.out.println("flag..."+flag);
        
        
        long startm = System.currentTimeMillis(); 	
        boolean flag1 = performPalindrome(str);
        long endm = System.currentTimeMillis(); 
        
    	System.out.println("time taken to  calculate  sorted...." + 
                   (endm - startm)  + "ms"); 

        System.out.println("flag..."+flag1);
	}

	private static boolean performPalindrome(String str) {
		char[] chararray = str.toCharArray();
		int startIndex=0;
		int endIndex=str.length()-1;
		
		while(startIndex<endIndex)
		{
			if(chararray[startIndex]!=chararray[endIndex])
			return false;					
			 
			startIndex++;
			endIndex--;
			
			
		}
		
		return true;
	}

	
	/**
	 * @param str
	 * @return boolean
	 */
	private static boolean stringPalindrome(String str) {
		String orinalString=str;
		String reverseString="";
		boolean flag=false;
		char[] stringarr = str.toCharArray();
		for(int i=stringarr.length-1;i>=0;i--)
		{
			reverseString=reverseString+stringarr[i];
		}
		System.out.println("reverseString..."+reverseString);
		if(reverseString.equalsIgnoreCase(orinalString))
		return flag=true;
		else 
		return flag;
		
	}
		

}
