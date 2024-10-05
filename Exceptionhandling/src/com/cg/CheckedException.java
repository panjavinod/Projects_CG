package com.cg;

import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		
		                                 //ClassNotFoundException
        try {
        	Class.forName("com.cg.basics");
        }catch(Exception e) {
        	System.out.println(e);
        }
		                                  // IoException or FileNotFoundException
//		try {
//			FileWriter writer=new FileWriter("D:/data.txt");
//		} catch (IOException e) {
//			System.out.println(e);
//		}
	}

}
