package com.cg;

import java.util.Scanner;

//Write a Java program to create a method that takes a string as input 
//and throws an exception if the string does not contain vowels.
public class StringException {

	public static void checkString(String word) throws Exception {
		char[] ch=word.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u') {
				System.out.println(ch[i]);
			}else {
				throw new Exception(ch[i]+" is not vowel ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        String word=sc.next();
        try {
			checkString(word);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
