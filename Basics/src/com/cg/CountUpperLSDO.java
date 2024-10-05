package com.cg;

import java.util.Scanner;

public class CountUpperLSDO {
	public static void Count(String str) {
		    int upperCase = 0;  
	        int lowerCase = 0;  
	        int digits = 0;  
	        int others = 0; 
	       
	        for(int i=0;i<str.length();i++) {
	        	char ch=str.charAt(i);
	        	if(Character.isUpperCase(ch)) {
	        		upperCase++;
	        	}
	        	else if(Character.isLowerCase(ch)) {
	        		lowerCase++;
	        	}
	        	else if(Character.isDigit(ch)) {
	        		digits++;
	        	}
	        	
	        	else {
	        		others++;
	        	}
	        }
	        System.out.println("UpperCase "+upperCase);
	        System.out.println("LowerCase "+lowerCase);
	        System.out.println("Digits "+digits);
	        System.out.println("Others "+others);
	       
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		CountUpperLSDO.Count(s);
		
	}

}
