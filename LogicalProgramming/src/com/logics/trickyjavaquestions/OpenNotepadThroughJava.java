package com.logics.trickyjavaquestions;

import java.io.IOException;

public class OpenNotepadThroughJava {

	
	public static void main(String[] args) throws IOException {
		
		Runtime.getRuntime().exec("notepad.exe");
	}
}
