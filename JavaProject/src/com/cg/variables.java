package com.cg;

public class variables {
	int i=10;
	public static void printInstanceVar(variables obj) {
        System.out.println("Instance variable value: " + obj.i);
    }

	public static void main(String[] args) {
		variables obj=new variables();
		obj.printInstanceVar(obj);
		System.out.println(obj.i);
	}

}
