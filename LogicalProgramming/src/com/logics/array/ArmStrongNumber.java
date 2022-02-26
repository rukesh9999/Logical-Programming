package com.logics.array;

public class ArmStrongNumber {

	
	public static void main(String[] args) {
		
		int number =154;
		int temp=number;
		int sum=0;
		
		while(number>0)
		{
			int num =number%10;
			sum+=(num*num*num);
			number=number/10;
		}
		
		System.out.println("sum ....."+sum   +"temp..."+temp);
		
		if(sum==temp)
		{
			System.out.println("given number is armstrong number ");
		}else {
			System.out.println("given number is not a armstrong number  ");
		}
		
	}
}
