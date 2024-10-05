package com.cg;

public class Remove_whiteSpace {

	public static void main(String[] args) {
		String str=" Remove white spaces ";
		System.out.println("Using Trim function from String class -----  "+str.trim());
		System.out.println("Replaceing the other character -------- "+str.replaceAll(" ","#"));
        str=str.replaceAll(" ", "");
        System.out.println(str);
	}

}
