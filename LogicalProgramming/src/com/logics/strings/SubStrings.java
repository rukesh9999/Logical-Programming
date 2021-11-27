package com.logics.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SubStrings {

	static List<String> palindromeStr=new ArrayList<String>();
	public static void main(String[] args) {
		
		String  str="madam";
		Map<String, String> LinkedHashmap= new LinkedHashMap<String, String>();
 
		Map<String, String> Hashmap  = new HashMap<>();
		
		
		System.out.println(".........substring......");
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<=str.length();j++)
			{
				System.out.println(str.substring(i,j));
				Hashmap.put(str.substring(i,j), str.substring(i,j));
				LinkedHashmap.put(str.substring(i,j), str.substring(i,j));
				
			}
		}
		
		//System.out.println(".........hashmap......");
		
		Hashmap.forEach((key,value)->
		new SubStrings().findalindrome(key));
		
		
		//System.out.println(".........linkedHashMap......");
		
		

		LinkedHashmap.forEach((key,value)->
		new SubStrings().findalindrome(key));
		
		
		System.out.println(".................palindromeStr.................");
		if(palindromeStr.size()>0)
		{
			System.out.println(palindromeStr);
		}
		
	}
	
	
	
	
	public void findalindrome(String str) {
	
		if(str!=null && !"null".equalsIgnoreCase(str) && !str.equals("")) {
		boolean ispalindrome=false;
		char[] charry = str.toCharArray();
		int startIndex=0;
		int endIndex=charry.length-1;
		while(startIndex<endIndex)
		{
			if(charry[startIndex]==charry[endIndex]) {
			startIndex++;
			endIndex--;
			ispalindrome=true;
			}else {
				ispalindrome=false;
			}
		}
		
		if(ispalindrome)
		{
			palindromeStr.add(str);
		}
		
		
	}
	
	}
}
