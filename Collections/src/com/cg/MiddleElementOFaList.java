package com.cg;

import java.util.LinkedList;

public class MiddleElementOFaList {

	public static void main(String[] args) {
		LinkedList<String> fruits=new LinkedList<>();
		fruits.add("APPLE");
		fruits.add("BANANA");
		fruits.add("cat");
		fruits.add("mango");
		fruits.add("orange");
		String middle=fruits.get(fruits.size()/2);
		System.out.println(middle);
	}

}
