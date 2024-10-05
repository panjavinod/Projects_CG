package com.cg;

import java.util.Arrays;

public class Array_Youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"3","30","34","9","5"};
		System.out.println(largestNumber(arr));

	}
	public static String largestNumber(String arr[]) {
		
		Arrays.sort(arr,(num1,num2)->(num2+num1).compareTo(num1+num2));
		System.out.println(Arrays.toString(arr));
		String str="";
		for(String s:arr) {
			str=str+s;
		}
		return str;
		
	}

}
