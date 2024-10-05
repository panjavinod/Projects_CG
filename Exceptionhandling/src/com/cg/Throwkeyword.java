package com.cg;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Throwkeyword { 
	                                // unchecked
//	public static void validate(int age){		
//		if(age<18) {
//			throw new ArithmeticException("Not eligible to vote");
//		}
//		else {
//			System.out.println("Eligible to vote");
//		}
//	}
//
//	public static void main(String[] args) {
//	validate(13);
//	}
	
	                                  //checked 
	
//	If we throw a checked exception using throw keyword, it is must to handle the exception using
//	catch block or the method must declare it using throws declaration.
	public static void method() throws IOException {
		FileWriter writer=new FileWriter("D:/data.txt");
		  
	}
	public static void main(String[]args) {
		try {
			method();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
