package com.logics.javaconcepts;

import java.util.LinkedList;
import java.util.List;

public class ProducerAndConsumerProblem {
	LinkedList<Integer> list =null;
	int capacity=2;
	
	public ProducerAndConsumerProblem() {
	   list = new LinkedList();
	   
	}



	
	
	public void produce() throws InterruptedException
	{
		list.clear();
		Integer value=0;
		while(true)
		{
			
			synchronized (this) {
				
				while(list.size()==2)
				wait();
				//value+=1;
				System.out.println("Thread1 added  element ....."+value);
				list.add(value++);
				notify();
				
				wait();
				

				 
			}
			
			
		}
	}
	
	
	
	public void consume() throws InterruptedException {
		
		
		while(true)
		{
			synchronized (this) {
				
				while(list.isEmpty())
				wait();
				
				Integer first = list.removeFirst();
				System.out.println("Thread2 consumed element ....."+first);
				
				notify();
				
				wait();
				
				//Thread.sleep(1000);
			}
			
		}
	}	
}
