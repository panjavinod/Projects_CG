package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Example_One {
	
	public static boolean Validate(String s) {
//		List<Character> list=new ArrayList<Character>();
		Stack<Character> stack=new Stack<Character>();
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='}') {
				
				if(stack.peek()=='{') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(ch==')') {
				if(stack.peek()=='(') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else if(ch==']') {
				if(stack.peek()=='[') {
					stack.pop();
				}
				else {
					return false;
				}
			}
			else {
				stack.push(ch);
			}
		}
		if(stack.size()==0) {
			return true;
		}
		return false;
		
	}

	public static void main(String[] args) {
		String s="(){}[]";
		boolean status= Example_One.Validate(s);
		System.out.println(s);
		System.out.println(status);
		

	}

}
