package com.cg;

import java.util.Arrays;

public class String_Duplicate {

	public static void main(String[] args) {
		String str="abcgdunasimfysbjd";
		String duplicates="";
		char[] ch=str.toCharArray();
		Arrays.sort(ch);
		for(int i=0;i<str.length()-1;i++) {
			if(ch[i]!=ch[i+1]) {
				duplicates+=ch[i];
			}
		}
		duplicates+=ch[str.length()-1];
		System.out.println(duplicates);
		

	}

}
