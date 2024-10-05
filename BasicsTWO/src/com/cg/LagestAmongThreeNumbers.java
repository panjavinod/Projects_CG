package com.cg;

import java.util.Scanner;

public class LagestAmongThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println("Largest Number is 2"+a);
		}
		else if(b>a && b>c) {
			System.out.println("Largest Number is "+b);
		}
		else {
			System.out.println("Largest Number is "+c);
		}
	}

}
