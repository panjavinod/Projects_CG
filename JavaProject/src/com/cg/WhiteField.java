package com.cg;

import java.util.Scanner;

public class WhiteField {

	// series of string values and check the string length should be min 3 max 8 
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of strings: ");
       int series=sc.nextInt();
       for(int i=1;i<=series;i++) {
    	   System.out.println("Enter the String ");
    	   String str=sc.next();
    	   if (str.length() >= 3 && str.length() <= 8) {
               System.out.println("Valid string: " + str);
           } else {
               System.out.println("Invalid string: " + str);
           }
       }
     
	}

}
