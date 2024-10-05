package com.cg;

import java.io.FileWriter;
import java.io.IOException;

public class WriteAfile {

	public static void main(String[] args) {
		FileWriter fWriter;
		try {
			fWriter = new FileWriter("C:\\users\\File.txt");
			fWriter.write("------------ Welcome to File------------");
			fWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

}
