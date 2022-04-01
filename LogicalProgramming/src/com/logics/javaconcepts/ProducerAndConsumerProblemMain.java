package com.logics.javaconcepts;

import java.util.LinkedList;
import java.util.function.Supplier;


public class ProducerAndConsumerProblemMain {

	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ProducerAndConsumerProblem pc = new ProducerAndConsumerProblem();
		//Supplier<ProducerAndConsumerProblem> supplier = ProducerAndConsumerProblem::new;
		
		//ProducerAndConsumerProblem pc = supplier.get();
		
	   Thread t1 = new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				pc.produce();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	  });
		
		
	   Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					pc.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		  });
			 
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
	
	
	
	
		

}
