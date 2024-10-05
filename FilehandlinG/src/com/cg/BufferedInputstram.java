package com.cg;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputstram {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("C:\\users\\File.txt");
			BufferedInputStream bfin=new BufferedInputStream(fin);
			int i=0;
			while((i=bfin.read())!=-1) {
				System.out.print((char)i);
			}
			bfin.close();
			fin.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
