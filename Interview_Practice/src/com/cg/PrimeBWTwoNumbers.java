package com.cg;

import java.util.Scanner;

public class PrimeBWTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number ");
		int num1=sc.nextInt();
		System.out.println("Enter Second number ");
		int num2=sc.nextInt();
//		int[] primeNumbers=new int[]{};
		for(int i=num1;i<=num2;i++) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}
		

	}

}
