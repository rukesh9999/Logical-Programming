package com.logics.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingFileReader {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr =null;
		try {
			 fr = new FileReader(new File("rukesh_file.txt"));
			int c=0;
			while((c=fr.read())!=-1) {
				System.out.print((char)c);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
