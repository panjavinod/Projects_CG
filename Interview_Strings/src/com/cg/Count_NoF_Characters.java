package com.cg;

public class Count_NoF_Characters {

	public static void main(String[] args) {
		String string="vinod";
		System.out.println(" Number Of Characters in String "+string.length());
		String str="My name is java 99 main";
		int count=0,digit=0,space=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isAlphabetic(ch)) {
				count++;
			}else if(Character.isDigit(ch)){
				digit++;
			}else {
				space++;
			}
		}
		System.out.println("Characters is "+count);
		System.out.println("Digits is "+digit);
		System.out.println("Spaces is "+space);
	}

}
