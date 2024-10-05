package com.cg;

import java.util.Arrays;

public class StringDuplicaterecursion {	
		public static String duplicates(String s) {
			
//	        if (s.length() > 0) {
//	                char currentChar = s.charAt(0);
//	                int count = 1;
//	            for (int i = 1; i < s.length(); i++) {
//	                if (currentChar == s.charAt(i)) {
//	                    count++;
//	                }
//	            }
//	            String remaining = duplicates(s.substring(1));
//	            if (count > 1) {
//	                return currentChar + " " + count + " " + remaining;
//	            } else {
//	                return remaining;
//	            }
//	        }
//	        return "";
			if (s.length() <= 1) {
	            return s; 
	        }
	        	char currentChar = s.charAt(0);
	            String remainingString = duplicates(s.substring(1));
	            if (remainingString.indexOf(currentChar) != -1) {
	                return remainingString;
	            }
	            return currentChar + remainingString;	
	}
	public static void main(String[] args) {
		String string="aaabbbccdssgg";
		String duplicatesString =duplicates(string);
		System.out.println(duplicatesString);
	}

}
