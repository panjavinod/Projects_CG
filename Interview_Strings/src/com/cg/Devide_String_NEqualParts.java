package com.cg;

import java.util.Scanner;

public class Devide_String_NEqualParts {

	public static void main(String[] args) {
		String str = "aaaabbbbcccc";  
		System.out.println("Enter the howmany equal parts");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int strlength=str.length();
		int temp = 0, chars=strlength/n;
		String[] newstr=new String[n];
		
		if(strlength%n!=0) {
			System.out.println("Its not possible to devide");
		}else {
			for(int i=0;i<strlength;i=i+chars) {
				String part = str.substring(i, i+chars);  
				newstr[temp]=part;
				temp++;
			}
		}
		System.out.println(n + " equal parts of given string are ");  
        for(int i = 0; i < newstr.length; i++) {  
            System.out.println(newstr[i]);  
            }  
		

	}

}
