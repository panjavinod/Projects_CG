package com.cg;

import java.util.Scanner;

          //reverse a string and capitalize the first element
public class SExample {
	
	String Reverse(String str) {
		String sr="";
		String first="";
		if(str.length()==0) {
			System.out.println("String length is 0");
		}
		else {
			for(int i=str.length()-1;i>=0;i--) {
				sr+=str.charAt(i);
			}
			first=sr.substring(0, 1);
		}
		 
		return first.toUpperCase()+sr.substring(1);
	}

public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		SExample aa=new SExample();
		String a=aa.Reverse(s);
		System.out.println(a);
	}

}
