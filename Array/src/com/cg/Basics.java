package com.cg;

import java.util.Scanner;

public class Basics {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// fibonacci series == sum of previous two numbers
		
		System.out.println("Enter fibonacci number");
		Scanner sc=new Scanner(System.in);
		int count=sc.nextInt();
		System.out.print(n1+" "+n2);
		fibonacci(count-2);
		
//		for(int i=2;i<=count;i++) {
//			sum=n1+n2;
//			System.out.print(" "+sum);
//			n1=n2;
//			n2=sum;
//		}

	}

}
