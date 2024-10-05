package com.cg;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		
		s.push("DOG");
		s.push("Elephant");
		s.push("Cat");
		System.out.println("-------------------Before PoP--------------");
		System.out.println(s);
		System.out.println("-------------------After PoP--------------");
		s.pop();
		System.out.println(s);
		}

}
