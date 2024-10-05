package com.cg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {

	public static void readFile(String fileName) throws FileNotFoundException {
		File file=new File(fileName);
		
		Scanner scanner=new Scanner(file);
		
		while(scanner.hasNext()) {
			String line=scanner.nextLine();
			System.out.println(line);
		}
		scanner.close();
		
	}
	public static void main(String[] args) {
		try {
			readFile("home.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
