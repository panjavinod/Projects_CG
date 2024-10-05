package com.cg;

public class PowerOfNumber {

	public static void main(String[] args) {
		int number=3;
		int exponential=4;
		int result=1;
		for(int i=1;i<=exponential;i++) {
			 result *= number;
			 
		}
		System.out.println(result);
		System.out.println("Using Math.pow Operation "+Math.pow(3, 4));
	}

}
