package com.cg;

import java.util.Scanner;

public class StringReturn {
	
	public String Reverse(String nam) {

		String reverse=" ";
		for(int i=nam.length()-1;i>=0;i--) {
			reverse+=nam.charAt(i);
		}
             // String builder
//		StringBuilder sb=new StringBuilder(nam);
//		sb.reverse();
//		System.out.println(sb);
		return reverse;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println("Enter the String");
       Scanner sc=new Scanner(System.in);
       String name=sc.next();
       StringReturn aa=new StringReturn();
       String b=aa.Reverse(name);
       System.out.println(b);
       String a=" hello a";
       System.out.println(a.trim());  //hello a
       System.out.println(a.toUpperCase());  // HELLO A
       System.out.println(a.concat("java")); // hello ajava
       System.out.println(a.compareTo(b)); //7  ---- a==b:0 or a>b:positive or a<b:negative
       System.out.println(a.codePointAt(3)); //108
       System.out.println(a.contains("a"));//true
       System.out.println(a.contentEquals(a));//true
       System.out.println(a.endsWith("a"));//true
       System.out.println(a.isEmpty());//false
       System.out.println(a.indexOf("hello"));//1
       System.out.println(a.valueOf(10));//valueOf(int,char,boolean,float,long,double)convert premitive into string
	}

}
