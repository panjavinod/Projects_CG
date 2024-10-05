package com.cg;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		String s1="RaCe";
		String s2="care";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		if(s1.length()==s2.length()) {
			char ch1[]=s1.toCharArray();
			char ch2[]=s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			//boolean result=Arrays.equals(ch1, ch2);
			if(Arrays.equals(ch1, ch2)==true) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
		}else {
			System.out.println("Not Anagram");
		}
		
	}

}
