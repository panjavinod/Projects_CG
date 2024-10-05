package com.cg;

import java.util.Arrays;

public class countDigits {

	public static void main(String[] args) {
		int num=12345;
		String s=String.valueOf(num);
		System.out.println("DIGITS IN INTEGER "+s.length());
		char[] ch=s.toCharArray();
		int[] array = new int[ch.length]; 
		
		for(int i=0;i<ch.length;i++) {
			array[i]=Character.getNumericValue(ch[i]);
		}
		System.out.println(Arrays.toString(array));

		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		System.out.println("using count "+count);
	}

}
