package com.cg;

import java.util.Arrays;
import java.util.List;

public class TwoDigits_Even_NumberSum {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(5,20,22,10,14,13,27,37,4);
		int sum=0, EvenDigitCount=0;
		for(int i=0;i<list.size();i++) {
			int origionalNumber=list.get(i);
			int digits = 0;
			while(origionalNumber !=0) {
				origionalNumber /= 10;
				digits++;		
			}
			if(digits == 2 && list.get(i)%2==0) {		
				sum+=list.get(i);
				EvenDigitCount++;
			}
		}
		System.out.println(sum);
		System.out.println(EvenDigitCount);
		System.out.println("Average of two digits even numbers");
		System.out.println(sum/EvenDigitCount);
		
		String s="Travelling";
		s=s.replace('a','@');
		System.out.println(s);
		String reverse="";
		for(int i=s.length()-1;i>=0;i--) {
			reverse+=s.charAt(i);
		}
		System.out.println(reverse);
		
		//------------------------------------- three ------------------------------------
		String str="hello poorva";
	    String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
		
			if(i==2 ) {
				result+=Character.toUpperCase(ch);
			}else {
				result +=ch;
			}
		}
		System.out.println(result);

	}

}
