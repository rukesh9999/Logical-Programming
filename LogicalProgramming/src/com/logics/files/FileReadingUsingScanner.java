package com.logics.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		try {
			sc = new Scanner(new File("rukesh_file.txt"));
			
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}

}
