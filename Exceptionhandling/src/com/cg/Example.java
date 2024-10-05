package com.cg;

import java.util.Scanner;

//Write a Java program to create a method that takes an integer as a parameter 
//and throws an exception if the number is odd.
public class Example {

	public static void checkNum(int num) throws Exception {
		if(num%2!=0) {
			throw new Exception(num+ " is odd.");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		try {
			checkNum(num);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
