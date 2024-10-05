package com.cg;

public class StringBufferString {

	public static void main(String[] args) {
		String name="vinod";
		StringBuffer buffer=new StringBuffer(name);
		StringBuffer reverse=buffer.reverse();
		System.out.println(reverse);

	}

}
