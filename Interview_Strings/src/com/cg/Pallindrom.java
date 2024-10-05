package com.cg;

public class Pallindrom {

	public static void main(String[] args) {
		String s="hereereh";
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
		if(s.equals(reverse)) {
			System.out.println("It's a pallindrom");
		}else {
			System.out.println("It's not a apllindrom");
		}

	}

}
