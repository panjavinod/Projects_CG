package com.cg;

public class IntToString {

	public static void main(String[] args) {
		int i=200;
		String s=String.valueOf(i);
		String s1=Integer.toString(i);
		System.out.println(s);
		System.out.println(s1+100);//200100 because + is string concatenation operator  
		
	}

}
