package com.cg;

import java.io.FileNotFoundException;
import java.io.IOException;

class World{
	public void check() throws IOException{
		System.out.println("checking");
	}
}
public class Bank extends World{

	public void check()throws FileNotFoundException, IOException{
		System.out.println("Bank checking");
	}
	public static void main(String[] args) {
		World ww=new Bank();
		try {
			ww.check();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
