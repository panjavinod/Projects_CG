package com.cg;

import java.io.File;
import java.io.IOException;

public class GetFileData {

	public static void main(String[] args) {
		File Myfile=new File("C:\\users\\File.txt");
		if(Myfile.exists()) {
			System.out.println(Myfile.getName());
			System.out.println(Myfile.getAbsolutePath());
			System.out.println(Myfile.canRead());
			System.out.println(Myfile.canWrite());
			System.out.println(Myfile.canExecute());
			System.out.println(Myfile.compareTo(Myfile));
			System.out.println(Myfile.getPath());
			try {
				System.out.println(Myfile.getCanonicalPath());
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(Myfile.getParent());
			System.out.println(Myfile.getFreeSpace());
		}

	}

}
