package com.cg;

import java.util.Scanner;

public class StringPallindrom {

 public static String recursion(String s) {
	 if (s.length() >0) {
         return s.charAt(s.length() - 1) + recursion(s.substring(0, s.length() - 1));
     }
     return "";
	 
     
     
 }
 public static void main(String[] args) {
	 System.out.println("Enter the String to check its pallindrom ot not");
	 Scanner sc=new Scanner(System.in);
	 String string=sc.next();
	 String reverse=StringPallindrom.recursion(string);
	 System.out.println(reverse);                                                            
	 
	 
//	 String reverse="";
//	 for(int i=string.length()-1;i>=0;i--) {
//		 reverse+=string.charAt(i);
//	 }

//	 if(string.equals(reverse)) {
//		 System.out.println("Its a pallindrom");
//	 }else {
//		 System.out.println("its not a pallindrom");
//	 }
	 
	 
 }	
	
}
