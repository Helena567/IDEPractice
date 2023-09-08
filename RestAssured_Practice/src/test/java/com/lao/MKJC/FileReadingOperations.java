package com.lao.MKJC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String location = "FileWriting.txt";

		FileReader fileReader = new FileReader(location);
		BufferedReader reader = new BufferedReader(fileReader);

		// ----FirstLine----
		
		String currentLine = reader.readLine();
		System.out.println(currentLine);

		// ---All context---
		
		String currentLines;
		while ((currentLines = reader.readLine()) != null) {
			System.out.println(currentLines);

		}
		

	}

}
