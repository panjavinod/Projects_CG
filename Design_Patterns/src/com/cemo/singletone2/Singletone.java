package com.cemo.singletone2;

public class Singletone {

	public static void main(String[] args) {
		System.out.println("Lazy Instantiation: creation of instance when required.");
		Lazy lazy=Lazy.check();
		System.out.println(lazy);
		Lazy lazy1=Lazy.check();
		System.out.println(lazy1);
	}

}
