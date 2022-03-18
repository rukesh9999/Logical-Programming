package com.logics.javaconcepts;

import java.io.Serializable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Singleton  extends SuperClass implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static Singleton instance=null;
	
	static Lock lock = new ReentrantLock();
	
	@Override 
	protected Object clone() throws CloneNotSupportedException { 
	  //TODO Auto-generated method stub 
		return instance;
		
	}

    protected Object readResolve()
    {
       return instance;
    }

	private Singleton() throws InstantiationException {
		if(instance!=null)
		throw new InstantiationException("Single AlreadyCreated");
	}

	
	
	public static Singleton getInstance() throws InstantiationException {
		
		if(instance==null) {
		lock.lock();
		if(instance==null)
			instance =new Singleton();
			
		lock.unlock();
		}
		
		return instance;
	}
	
	
     public static void main(String[] args) throws InstantiationException {
		
		
		Singleton instance1 = Singleton.getInstance();
		
		Singleton instance2 = Singleton.getInstance();
		
		System.out.println("instance1....."+instance1.hashCode());
		System.out.println("instance2....."+instance2.hashCode());

		
	}
	
	
}
