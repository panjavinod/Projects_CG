package com.cg;

import java.util.Scanner;

public class ModuloEvenNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("Enter the number");
		int number=sc.nextInt();
	   int rev=(number/2)*2;
	   if(rev==number) {
		   System.out.println("Even number");
	   }
	   else {
		   System.out.println("odd number");
	   }
	}
	}
}
