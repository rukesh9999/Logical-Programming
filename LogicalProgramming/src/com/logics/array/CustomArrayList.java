package com.logics.array;

import java.util.Arrays;

public class CustomArrayList {

	private int capacity =7;	
	Object[] object = null;
	private int count=0;
	transient Object[] displayObject=null;
	CustomArrayList()
	{
		
		 object = new Object[capacity];
	}
	
	
	/**
	 * This Method is Used to add anobject to arraylist
	 * 
	 * @param obj
	 * @return void
	 */
	public void add(Object obj)
	{
		if(count>=capacity) 
		object=ensureCapacity(capacity,object);	
		object[count]=obj;
		count++;	
	}
	
	/**
	 * This Method is Used to add an object to arraylist
	 * based on index
	 * @param index
	 * @param obj
	 */
	public void add(int index,Object obj)
	{
		if(count>=capacity) 
		object=ensureCapacity(capacity,object);	
		object[index]=obj;	
	}

	/**
	 * This Method is Used to increase  capacity of arraylist
	 * @param oldcapacity
	 * @param object
	 * @return
	 */
	private Object[] ensureCapacity(int oldcapacity,Object[] object) {
		capacity = oldcapacity*2;
		Object[] newobjectarr = new Object[capacity];
		int count=0;
		for(Object obj : object)
		{
			newobjectarr[count]=obj;
			count++;
		}
		object=null;
		return newobjectarr;
	}
	
	/**
	 * This Method is Used to get  size of arraylist
	 * based on index
	 * @param 
	 * @return int
	 */
	public int size()
	{
		int count=0;
		for(Object obj : object)
		{
			if(obj!=null)
			count++;
		}
		return count;
	}
	
	/**
	 * This Method is Used to get  object from arraylist
	 * based on index
	 * @param 
	 * @return int
	 */
	public Object get(int val) {
		int count=0;
		Object reqobject=null;
		for(Object obj: object)
		{
			if(obj!=null) {
			if(count==val)	
			return  reqobject=obj;
			count++;
			}
		}
		return reqobject="required object not found";
		//return reqobject;
	}
	
	/**
	 * This Method is Used to display capacity of arraylist
	 * 
	 * @param 
	 * @return int
	 */
	public int getcapacity()
	{
		return capacity;
	}

	/**
	 * This Method is Used to display count of arraylist
	 * 
	 * @param 
	 * @return int
	 */
	public int count()
	{
	  return 1;
	}
	
	/**
	 * This Method is Used to display arraylist object
	 * 
	 * @param 
	 * @return void
	 */
	public void display() {
	int size = size();
	int cnt=0;
    displayObject = new Object[size];
		
	  for(Object obj : object)
	   {
		  if(obj!=null)
		  displayObject[cnt] = obj; 
		  cnt++;
	   }
	}
	
	
	
	/**
	 * This Method is Used to remove object from  arraylist
	 * based on index
	 * @param val
	 * @return void
	 */
	public void remove(int val)
	{   int count=0;
	    Object req=null;
		for(Object obj: object)
		{
			if(val==count)
			{
				for(int i=val;i<object.length-1;i++) {
					if(object[i]!=null) 
					object[i]=object[i+1];					
				}
               
			}
			else
			req="required number not found";
			count++;
		}
	}
	
	
	/**
	 * This Method is Used to remove Object from arraylist
	 * @param val
	 * @return void
	 */
	public void removeObject(Object val)
	{   int count=0;
	    Object req=null;
		for(Object obj: object)
		{
			if(obj!=null)
			if(obj.equals(val))
			{
				
				for(int i=count;i<object.length-1;i++) {
					if(object[i]!=null) 
					 object[i]=object[i+1];
					
				}
               
			}
			else
			throw new IndexOutOfBoundsException("reuired object not found");
			count++;
		}
	}
	
	/**
	 * This Method is Used to Clear arraylist
	 * @param 
	 * @return void
	 */
	public void clear()
	{
		int cnt=0;
		for(Object obj:object)
		{
			if(obj!=null)
			object[cnt]=null;
			cnt++;
		}
	}
	
	/**
	 * This Method is used to find arraylist contains
	 * particular object or not
	 *  
	 * @param obj
	 * @return boolean
	 */
	public boolean contains(Object obj)
	{
		boolean flag=false;
		for(Object containsobj:object)
		{
		   if(containsobj!=null)
		   if(containsobj.equals(obj))
           return flag=true;
		}
		return flag;	
		
	}
	
	
	
	/**
	 * This method used o display Arraylist Object
	 */
	@Override
	public String toString() {
		display();
		return "CustomArrayList " + Arrays.toString(displayObject);
	}
	
	
	
}
