package com.cg;

public class FinalBlock {

	public static void main(String[] args) {
		try {
			int a=100/0;
		}catch(Exception e) {
			System.out.println(e);
			//e.printStackTrace();
		}
		finally {
			System.out.println("we Cant devide the 100/0");
		}

	}

}
