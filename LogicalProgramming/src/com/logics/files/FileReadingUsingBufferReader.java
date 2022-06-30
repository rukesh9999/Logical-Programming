package com.logics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingUsingBufferReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		try {
			br = new BufferedReader(new FileReader(new File("rukesh_file.txt")));
			int c=0;
			while((c=br.read())!=-1) {
				System.out.print((char)c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
