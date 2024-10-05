package com.demo;

import java.util.Random;
import java.util.Scanner;

public class PrintNRandomNumbers {

	public static void main(String[] args) {
		System.out.println("Enter how many numbers you want to print : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Random random=new Random();
		
		random.ints(10, 99).limit(n).forEach(System.out::println);
		System.out.println("--------------------------------------------------");
		for(int i=1;i<6;i++) {
			//int a=random.nextInt(6);
			int a=1+random.nextInt(6); // wont print zero's
			System.out.println(a);
		}
		// immutable class
		// parent lo exception vaste child lo trow cheyyocha
		// hascode,equal,collision
		
		

	}

}
