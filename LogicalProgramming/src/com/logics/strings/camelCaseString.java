package com.logics.strings;

public class camelCaseString {

	public static void main(String[] args) {
		
		//String str="ALL*& DOGS ARE NO@t BYtes% ye#s";
		String str="ALL*& DOGS ARE NOt@ BYtes% yes#";
		String removedspecs = str.replaceAll("[^a-zA-z]", " ");
		System.out.println("removedspecs...."+removedspecs);
		String[] strarray = removedspecs.split(" ");
		String[] camelcasearr= new String[strarray.length];
		int count=0;
		for(String string : strarray)
		{
			if(count==0)
			{
				camelcasearr[count]=string.toLowerCase();
			}
			else {
				if(!string.equals("") && string!=null) {
				String firstletter = string.substring(0,1).toUpperCase();
				String remletters =string.substring(1).toLowerCase();
				String finalstr =firstletter+remletters;
				camelcasearr[count]=finalstr;
				
				}
			}
			
			count++;
		}
		
		for(String camelstr : camelcasearr)
		{
			if(camelstr!=null) {
			System.out.print(camelstr);
			System.out.print(" ");
			}
		}
		
	}
}
