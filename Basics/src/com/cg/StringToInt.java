package com.cg;

public class StringToInt {

	public static void main(String[] args) {
	String s1="200";
	int i=Integer.parseInt(s1);
	int j=Integer.valueOf(s1);
	
	System.out.println(i);
	System.out.println(j);
	System.out.println("---------------------");
	System.out.println(s1+100);
	System.out.println(i+100);
	}

}
