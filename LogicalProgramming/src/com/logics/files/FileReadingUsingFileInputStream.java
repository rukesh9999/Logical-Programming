package com.logics.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadingUsingFileInputStream {

	public static void main(String[] args) {
		InputStream is =null;
		try {
			 is = new FileInputStream(new File("rukesh_file.txt"));
			 int c=0;
			while((c=is.read())!=-1) {
				 System.out.print((char)c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		

	}

}
