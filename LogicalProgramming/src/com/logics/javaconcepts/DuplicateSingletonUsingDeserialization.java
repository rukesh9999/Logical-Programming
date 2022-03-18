package com.logics.javaconcepts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DuplicateSingletonUsingDeserialization {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException {
		
		Singleton instance1 = Singleton.getInstance();
		
		FileOutputStream fos =new FileOutputStream("file.txt");
		ObjectOutputStream oos = new  ObjectOutputStream(fos);
		oos.writeObject(instance1);
		oos.close();
		
		FileInputStream fis = new FileInputStream("file.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Singleton instance2 = (com.logics.javaconcepts.Singleton) ois.readObject();
		
		
		System.out.println("instance1....."+instance1.hashCode());
		System.out.println("instance2....."+instance2.hashCode());
		
	}
}
