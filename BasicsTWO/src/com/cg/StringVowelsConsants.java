package com.cg;

public class StringVowelsConsants {

	public static void main(String[] args) {
		String s="AppleiLoveyou  12";
		int vowels=0;
		int consonents=0;
		int digits=0;
		int spaces=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}
			else if(ch>='a'&&ch<='z') {
				consonents++;
			}
			else if(ch>='0' && ch<='9') {
				digits++;
			}
			else if (ch == ' ') {
		        ++spaces;
		      }
		}
		System.out.println("Number of vowels is "+vowels);
		System.out.println("Number of consonents "+consonents);
		System.out.println("Number of digits is "+digits);
		System.out.println("Number of spaces is "+ spaces);
	}

}
