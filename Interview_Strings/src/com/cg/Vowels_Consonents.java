package com.cg;
//Java Program to find maximum and minimum occurring character in a string.
//Java Program to find the longest repeating sequence in a string
public class Vowels_Consonents {

	public static void main(String[] args) {
		String str="ainmtheouss";
		int vowels=0,consonents=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels++;
			}else {
				consonents++;
			}
		}
		System.out.println("Vowels in given string "+vowels);
		System.out.println("Consonents in given string "+consonents);

	}

}
