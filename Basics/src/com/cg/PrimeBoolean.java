package com.cg;

import java.util.Scanner;

public class PrimeBoolean {
	public boolean validate(int num) {
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the number to check prime or not");
	   int num=sc.nextInt();
		PrimeBoolean val=new PrimeBoolean();
		boolean result=val.validate(num);
		System.out.println(result);
	}

}
