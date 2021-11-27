package com.logics.strings;

public class DeadLock {

	
	public static void main(String[] args) {
		
		String resource1="resource1";
		String resource2="resource2";
		
		
		Runnable thread1 =new Runnable() {
			
			@Override
			public void run() {
				
              synchronized (resource1) {
            	  System.out.println("thread1 holding  resource1  lock");
            	  
            	  try {
					 Thread.sleep(1000);
				   } catch (InterruptedException e) { 
					// TODO Auto-generated catch block
					 e.printStackTrace();
				  }
            	  
            	  System.out.println("thread1 waiting for resource2 lock");
            	  
            	  synchronized (resource2) {
            		  System.out.println("thread1  holding resource1 and resource2 lock");
				 }
				
			  }

              
				
			}
		};
		
		
		
		
		Runnable thread2 =new Runnable() {
			
			@Override
			public void run() {
				synchronized (resource2) {
				
					System.out.println("thread2 holding resource2 lock");
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					 System.out.println("thread2 waiting for resource1 lock");
					synchronized (resource1) {
						System.out.println("thread2 holding resource1 and resource2 lock");
					}
				}
				
			}
		};
		
		
		
		new Thread(thread1).start();
		
		new Thread(thread2).start();
	}
	
	
	
}
