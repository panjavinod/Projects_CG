package com.cg;

import java.io.File;

public class GetFileExtension {

	public static void main(String[] args) {
		File myFile=new File("C:\\users\\File.txt");
		String fileName= myFile.toString();
		int index=fileName.lastIndexOf('.');
		System.out.println(index);
		if(index>0) {
			String extension=fileName.substring(index+1);
			System.out.println("File extension is " + extension);
		}

	}

}
