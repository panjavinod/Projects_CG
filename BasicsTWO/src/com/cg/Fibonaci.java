package com.cg;

import java.util.Scanner;

public class Fibonaci {
	// with out using recursion
//	public static void main(String[] args) {
//		int n1=0;
//		 int n2=1;
//             int sum;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the fibonaci number");
//         int number=sc.nextInt();
//         System.out.print(n1+" "+n2);
//         for(int i=2;i<=number;i++) {
//        	 sum=n1+n2;
//        	 n1=n2;
//        	 n2=sum;
//        	 System.out.print(" "+sum);
//         }
//	}
	
	//using recursion
	static int n1=0;
	static int n2=1;
	static int sum;
	public static void fibonacci(int count) {
		
		if(count>0) {
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
			fibonacci(count-1);
		}
		
	}
public static void main(String[]args) {
	System.out.println("Enter fibonacci number");
	Scanner sc=new Scanner(System.in);
	int count=sc.nextInt();
	System.out.print(n1+" "+n2);
	fibonacci(count-2);
}
}
