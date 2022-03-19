package com.logics.javaconcepts;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class DeadLockUsingLocks {

	
	
	public static void main(String[] args) {
		
		Lock lock1 = new ReentrantLock();
		Lock lock2 = new ReentrantLock();
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {

				lock1.lock();				  
				  System.out.println("thread1 holding resource1");
				  
				  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					System.out.println("thread1 trying to hold  resource2");
					
					lock2.lock();	
					System.out.println("thread1 holding resource2");
					lock2.unlock();
				  
				lock1.unlock();
				
				
				
			}
		};
		
		

		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				
				lock2.lock();				  
				  System.out.println("thread2 holding resource2");
				  
				  try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					
					System.out.println("thread2 trying to hold  resource1");
					
					lock1.lock();	
					System.out.println("thread2 holding resource1");
					lock1.unlock();
				  
				lock2.unlock();
				
				
			}
		};
		
		
		new Thread(runnable1).start();
		new Thread(runnable2).start();
		
		
	}
}
