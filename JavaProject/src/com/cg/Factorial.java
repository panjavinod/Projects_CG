package com.cg;

import java.util.Scanner;

public class Factorial {
	static int sum=1;
	public int recursion(int num) {
		
		if(num>0) {
			sum=sum*num;
			recursion(num-1);
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Enter the factorial number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		Factorial factorial=new Factorial();
		int answer=factorial.recursion(number);
       System.out.println(answer);
	}

}
