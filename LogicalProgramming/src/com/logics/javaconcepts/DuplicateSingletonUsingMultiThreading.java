package com.logics.javaconcepts;


public class DuplicateSingletonUsingMultiThreading {

	public static void main(String[] args) {
		
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				Singleton instance;
				try {
					instance = Singleton.getInstance();
					System.out.println(instance.hashCode());
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		
	Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Singleton instance;
				try {
					instance = Singleton.getInstance();
					System.out.println(instance.hashCode());
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
   Runnable runnable3 = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Singleton instance;
				try {
					instance = Singleton.getInstance();
					System.out.println(instance.hashCode());
				} catch (InstantiationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		new Thread(runnable1).start();
		new Thread(runnable2).start();
		new Thread(runnable3).start();

	}

}
