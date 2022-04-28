package com.logics.array;

public class Pattern {

	
	public static void main(String[] args) {
		
		int length=5;
		for(int i=1;i<=length;i++)
		{
			
			for(int j=1;j<=length;j++)
			{
				if( i>=2 && j>=2 && i<=4 &&j<=4 )
				System.out.print("# ");
				else 
				System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
}
