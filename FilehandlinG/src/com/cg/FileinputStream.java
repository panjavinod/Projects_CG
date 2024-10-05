package com.cg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileinputStream {

	public static void main(String[] args) {
		
			try {
				FileInputStream fin=new FileInputStream("C:\\users\\File.txt");
				//to Read Single Charecter
//				int i=fin.read();
//				System.out.println((char)i);
//				fin.close();
				//to Read Group of Charecters
				int i;
				while((i=fin.read())!=-1) {
					System.out.print((char)i);
				}
				fin.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} 
	}


