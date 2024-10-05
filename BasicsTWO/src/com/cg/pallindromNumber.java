package com.cg;

import java.util.Scanner;

public class pallindromNumber {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int number=sc.nextInt();
	int temp=number;
	int reverseNumber=0;
	while(number>0) {
		int remainder = number%10;                     //252-- 2,5,2
		reverseNumber=(reverseNumber*10)+remainder;
		number=number/10;               // 25,2
		
	}
	System.out.println(number);
	if(temp==reverseNumber) {
		System.out.println("Its a pallindrom");
	}else {
		System.out.println("Its not a pallindrom");
	}
	
		
	}

}
