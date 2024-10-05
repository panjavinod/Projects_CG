package com.cg;

public class Example {
	public int add(int x,int y) {
		int c=x+y;
		return c;
	}

	public static void main(String[] args) {
		int a=10;
		int b=20;
		Example aa=new Example();
       int result= aa.add(a, b);
        System.out.println(result);
	}

}
