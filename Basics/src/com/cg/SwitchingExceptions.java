package com.cg;

import java.util.Scanner;

public class SwitchingExceptions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Iterations Do You want");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
		System.out.println("Enter the your Choice");
		int number=sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("Arthimetic Expression");
			break;
		case 2:
			System.out.println("NullPointer Expression");
			break;
		case 3:
			System.out.println("NumberFormate Expression");
			break;
		case 4:
			System.out.println("OutOfBoundary Expression");
			break;
		}
	}
}

}
