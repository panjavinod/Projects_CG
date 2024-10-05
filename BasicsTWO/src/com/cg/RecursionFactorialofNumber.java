package com.cg;

import java.util.Scanner;

public class RecursionFactorialofNumber {
//	static int sum=1;
//    public static int Recursion(int num) {
//    	if(num>=1) {
//    	sum*=num;
//    	Recursion(num-1);
//    	}
//		return sum;
//    	
//    	
//    }
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Factorial Number ");
//		int number=sc.nextInt();
//	    int result=Recursion(number);
//        System.out.println(result);
//
//	}
	
	public static void main(String[] args) {
        int num = 6;
        long factorial = multiplyNumbers(num);
        System.out.println("Factorial of " + num + " = " + factorial);
    }
    public static long multiplyNumbers(int num)
    {
        if (num >= 1)
            return num * multiplyNumbers(num - 1);
        else
            return 1;
    }

}
