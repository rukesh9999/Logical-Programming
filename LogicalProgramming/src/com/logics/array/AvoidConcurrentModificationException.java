package com.logics.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class AvoidConcurrentModificationException {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		
		Iterator<String> iterator = list.iterator();
		System.out.println(list);
		while(iterator.hasNext())
		{
		  String str = 	iterator.next();
		  if(str.equalsIgnoreCase("4")) 
		  iterator.remove();
		  
		 
		}
		 System.out.println(list);
	}
}
