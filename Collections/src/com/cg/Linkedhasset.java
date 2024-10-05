package com.cg;

import java.util.LinkedHashSet;

public class Linkedhasset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();  
		lhs.add("Java");  
		lhs.add("Tea");  
		lhs.add("Pointer");  
		lhs.add("Good");  
		lhs.add("Web");
		lhs.add(null);
		System.out.println("The hash set is: " + lhs); 
		System.out.println(lhs.remove("Good"));
		System.out.println("After removing the element, the hash set is: " + lhs);  
		System.out.println(lhs.remove("For"));  
	}

}
