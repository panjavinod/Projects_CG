package com.cg;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {
	
		try {
			File myReader=new File("C:\\users\\File.txt");
			Scanner Sc=new Scanner(myReader);
			while(Sc.hasNextLine()) {
				String data=Sc.nextLine();
				System.out.println(data);
			}
			Sc.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
