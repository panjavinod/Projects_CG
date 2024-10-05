package com.cg;

public class CaptilizeFirstLatter {

	public static void main(String[] args) {
		
		// toggle
		
		String sb="the quick brown fox jumps over the lazy dog.";
		String reverseToggle="";
		
		
		String[] words=sb.split(" ");
		for(String s:words) {
			String first=s.substring(0, 1);
			String second=s.substring(1);
			reverseToggle+=first.toUpperCase()+second.toLowerCase()+" ";
		}
	    System.out.println(reverseToggle);

	}

}
