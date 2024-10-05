package com.cg;

public class StringPallindrom {

	public static void main(String[] args) {
		String s="mom";
		String reverse="";
		for(int i=(s.length()-1);i>=0;i--) {
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
		if(s.equals(reverse)) {
			System.out.println("given string is pallindrom");
		}
		else {
			System.out.println("given string is not apallindrom");
		}
         
	}

}
