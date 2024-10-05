package com.cg;

public class Recursion_Number {
	static int  reversenumber=0;
	public static void numRecursion(int number) {
		
		if(number>0) {
			int digit=number%10;
			reversenumber=reversenumber*10+digit;
			numRecursion(number/10);
		}
	
	}

	public static void main(String[] args) {
		int num =505;
		numRecursion(num);
		System.out.println(reversenumber);

	}

}
