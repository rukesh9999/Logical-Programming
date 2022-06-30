package com.logics.files;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.List;

public class FileReadingUsingNIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			
			List<String> lines =  Files.readAllLines(Paths.get("rukesh_file.txt"),StandardCharsets.UTF_8);
			Iterator<String> itr = lines.iterator();
			int linesCount=0;
			int wordCount=0;
			int charCount=0;
			int spaceCount=0;
			while(itr.hasNext()) {
				
				String line = itr.next();
				System.out.println(line);
				String[] words = line.split(" ");
				String[] chars = line.split("");
				
				for(String s:chars) {
					if(s!=null && !s.equalsIgnoreCase(null) && !s.isBlank() && !s.isEmpty()) {
						charCount++;
					}else {
						spaceCount++;
					}
				}
				
				wordCount+=words.length;
			    linesCount++;
			}
			
			System.out.println("Lines Count============"+linesCount);
			System.out.println("Words Count============"+wordCount);
			System.out.println("chars Count============"+charCount);
			System.out.println("Space Count============"+spaceCount);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
