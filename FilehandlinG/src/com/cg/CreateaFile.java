package com.cg;

import java.io.File;
import java.io.IOException;

public class CreateaFile {

	public static void main(String[] args) {
		File myFile=new File("C:\\users\\File.txt");
		try {
			if(myFile.createNewFile()){
				System.out.println("Successfully created"+myFile.getName());
			}
			else {
				System.out.println("File Already creadted");
			}
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
           // File myFile=new File("C:File.txt");
//		if(myFile.exists()) {
//			System.out.println(myFile.getAbsolutePath());
//		}
		//C:\Users\pvinod\eclipse-workspace\FilehandlinG\File.txt

	}

}
