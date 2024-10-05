package com.cg;

import java.util.Scanner;

public class RecursionNaturalNumbers {
	static int sum=0;
    public static int Recursion(int num) {
    	if(num>0) {
    	sum+=num;
    	Recursion(num-1);
    	}
		return sum;
    	
    	
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Natural Number ");
		int number=sc.nextInt();
	    int result=Recursion(number);
        System.out.println(result);
	}

}
