package com.cg;

public class Factorial2 {
	
	public static int factorial(int number) {
		if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
	}

	public static void main(String[] args) {
		
		int num=Factorial2.factorial(5);
		System.out.println(num);
	}

}
