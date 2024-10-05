package com.cg;

public class CountNofDigitsInINTEGER {

	public static void main(String[] args) {
		int number =12345;
		int count=0;
		while(number!=0) {
			number=number/10;
			count++;
		}
		System.out.println("No of digits in 12345 is "+count);
		
	}

}
