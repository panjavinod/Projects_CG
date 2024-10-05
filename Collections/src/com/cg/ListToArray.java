package com.cg;

import java.util.ArrayList;

public class ListToArray {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("Apple");
		a1.add("Banana");
		a1.add("sapota");
		
		System.out.println("-----------ArrayList------------"+a1);
		String[] s=new String[a1.size()];
		a1.toArray(s);
		System.out.println("-------------------------");
		for(String aa:s) {
			System.out.println(aa);
		}
	}

}
