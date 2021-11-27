package com.logics.strings;

public class Converter {

	 static String commonResultString="";
	
	public static String buildString(int input){
		  
		  return  Converter.converToString(input);

		}

		public static String converToString(int num)
		{
		  String resultString="";
		  
		  if(num>0)
		  {
		    String number = String.valueOf(num);
		    
		   for(int index=0;index<number.length();index++)
		   {
			  
		      if(String.valueOf(number.charAt(index)).equals(String.valueOf(1)))
		     {
		       resultString+="apple";
		     }else if(String.valueOf(number.charAt(index)).equals(String.valueOf(2)))
		    {
		     resultString+="orange";
		    }else if(String.valueOf(number.charAt(index)).equals(String.valueOf(3)))
		     resultString+="banana";
		   }
		   
		  }else{
		    throw new RuntimeException("input must be greater than zero");
		   }

		 return resultString;
		}

	public static void main(String[] args) {
		String str = buildString(123);
		System.out.println("....."+str);
	}
}
