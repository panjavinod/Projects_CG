package com.cg;

import java.util.ArrayList;

public class ListTOString {

	public static void main(String[] args) {
		ArrayList<String> array=new ArrayList<>();
		array.add("A");
		array.add("B");
		System.out.println("List "+array);
		String str=String.valueOf(array);
		System.out.println("String "+str);
		String arraylist = array.toString();
	    System.out.println("String: " + arraylist);
		
	}

}
