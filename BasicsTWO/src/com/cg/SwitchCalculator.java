package com.cg;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter The first element ");
		int a=sc.nextInt();
		System.out.println(" Enter The second element ");
		int b=sc.nextInt();
		
		System.out.println("Enter the operator which you want ");
		char operator=sc.next().charAt(0);
		switch(operator) {
		case'+':
			System.out.println("Editon operation "+(a+b));
			break;
		case'-':
			System.out.println("Minus operation "+(a-b));
			break;
		case'*':
			System.out.println("Multiplication operation "+(a*b));
			break;
		case'/':
			System.out.println("Division operation "+(a/b));
			break;
		case'%':
			System.out.println("Modulo operation "+(a%b));
			break;
		 default:
		        System.out.println("Invalid operator!");
		        break;
		}
	
	}

}
