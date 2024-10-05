package com.cg;

import java.util.Scanner;

public class IntToChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ascii values Upper case= 65-90
		// Lower Case = 97-122
//		System.out.println("Enter Upper case Number");
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		for(int i=65;i<=a;i++) {
//			System.out.print(" "+(char)i );
//		}
//		System.out.println("Enter Lower case Number");
//		int b=sc.nextInt();
//		for(int i=97;i<=b;i++ ) {
//			System.out.print(" "+(char)i );
//		}
//		for(char d='A';d<='Z';d++) {
//			System.out.print(" "+d);  
//		  }
		
		// prime number 
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}	
		}
		if(count==2) {
			System.out.println("Its a prime number");
		}
		else {
			System.out.println("Its not a prime number");
		}
	}
  
}
