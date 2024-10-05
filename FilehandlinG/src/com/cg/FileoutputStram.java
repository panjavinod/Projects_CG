package com.cg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileoutputStram {

	public static void main(String[] args) {
			 try {
				 FileOutputStream fout=new FileOutputStream("C:\\users\\File.txt");
				 String s="Welcome to javaTpoint.";    
	             byte b[]=s.getBytes();//converting string into byte array
	             fout.write(b);
//				fout.write(65);
				fout.close();
				System.out.println("success...");    
			} catch (IOException e) {
				
				e.printStackTrace();
			}    
		} 
	}

