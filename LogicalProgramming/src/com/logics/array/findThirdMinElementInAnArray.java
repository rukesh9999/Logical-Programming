package com.logics.array;

public class findThirdMinElementInAnArray {
	
	
	
   public static void main(String[] args) {
	
	   int arr[] = {7,9,2,5,4,1,0,6};
	   
	   int first_min_ele=arr[0];
	   int sec_min_ele=arr[1];
	   int third_min_ele=arr[2];
	   for(int a: arr) {
		   
		   if(a<first_min_ele) {
			   third_min_ele=sec_min_ele;
			   sec_min_ele =first_min_ele;
			   first_min_ele=a;
		   }else if(a<sec_min_ele)
		   {
			    third_min_ele=sec_min_ele;
			    sec_min_ele=a;
		   }else if(a<third_min_ele) {
			   
			   third_min_ele=a;
		   }
		   
	   }
	   
	   
	   System.out.println("first Min Element........."+first_min_ele);
	   System.out.println("second Min Element........"+sec_min_ele);
	   System.out.println("Third Min Element........."+third_min_ele);
}
   
   
}
