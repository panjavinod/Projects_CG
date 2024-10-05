package com.cg;

public class FrequencyOfTheCharecter {

	public static void main(String[] args) {
		String s="Hii Helloo My Name Is java developer";
		char ch='a';
		int frequency=0;
		for(int i=0;i<s.length();i++) {
			if(ch == s.charAt(i)) {
				frequency++;
			}
			
		}
		System.out.println("Frequency of " + ch + " = " + frequency);

	}

}
