package com.cg;

import java.util.HashMap;
import java.util.Scanner;

public class Reverse_String_WOT_InbuiltMethods {
// 1) Write a Java Program to reverse a string without using String inbuilt function.
	public static void main(String[] args) {
		String s="my name is java";
		StringBuilder sb=new StringBuilder();
		sb=sb.append(s);
		sb=sb.reverse();
		System.out.println(sb);
	
		
		 String str = "my name is java";
	        char chars[] = str.toCharArray(); 
	        String reverse="";
	        // converted to character array and printed in reverse order
	        for(int i= chars.length-1;i>=0; i--) {
	        	reverse+=chars[i];
	        }
	        System.out.println(reverse);
	        
	        String strr;
	        Scanner in = new Scanner(System.in);
	        System.out.println("Enter your String");
	        str = in.nextLine();
	        String[] token = str.split("");    //used split method to print in reverse order
	        for(int i=token.length-1; i>=0; i--)
	        {
	            System.out.print(token[i] + "");
	        }  
	        
//Write a Java Program to swap two numbers using the third variable.
	        int a=2,b=4,c;
	        System.out.println("Before Swap "+a+" "+b);
	        c=a;
	        a=b;
	        b=c;
//	        c=a+b; //6
//	        b=c-b; //6-4=2
//	        a=c-b; //6-2=4
	     
	        System.out.println("After Swap "+a+" "+b);
//Write a Java Program to swap two numbers without using the third variable.
	        int i=5,j=10;
	        i=i+j; 
	        j=i-j; //6-4 =2
	        i=i-j; //6-2 =4
	        System.out.println("Without Using 3rd variable After Swap "+i+" "+j);
	        
	        
	        

	}

}
