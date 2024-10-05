package com.cg;

public class SwapIntegerNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("before Swap "+a+" "+b);
		a=a+b; //30
	
		b=a-b;  //10
		a=a-b; //20
		System.out.println("After Swap "+a+" "+b);
	}

}
