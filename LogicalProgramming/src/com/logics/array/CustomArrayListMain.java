package com.logics.array;

import java.util.ArrayList;

public class CustomArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Object> al =new ArrayList<>();
     al.add("amab");
     al.add(10);
     al.add(10.09); al.add(10.09); al.add(10.09);
     al.remove(1);
     al.clear();
     ///System.out.println(al);
     
     
    
 		CustomArrayList cst = new CustomArrayList();
 		cst.add("rukesh");
 		cst.add(10);
 		cst.add("mounica");
 		cst.add("nani");
 		cst.add(12.7);
 		cst.add(12.7);
 		cst.add(200);
 		cst.add("wwww");
 		System.out.println(cst);
 		System.out.println(cst.size());
 		System.out.println(cst.get(7));
 		System.out.println(cst.getcapacity());
 		System.out.println(cst.contains("wwww"));
 		cst.add(0, "ram");
 		//cst.remove(1);
 		//cst.remove(0);
 		//cst.remove(2);cst.remove(0);cst.remove(0);cst.remove(0);cst.remove(110);
 		//cst.removeObject(200);
 		//cst.clear();
 		System.out.print(cst);
 	
	}

}
