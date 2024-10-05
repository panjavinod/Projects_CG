package com.cg;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputstream {

	public static void main(String[] args) {
		
		
			
			try {
				FileOutputStream fout = new FileOutputStream("C:\\users\\File.txt");
				BufferedOutputStream bfout=new BufferedOutputStream(fout);
				String s="Welcome to java";
				byte b[]=s.getBytes();
				bfout.write(b);
				System.out.println("Success");
				bfout.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
		

	}


