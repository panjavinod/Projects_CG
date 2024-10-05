package com.demo;

import java.util.Arrays;

public class Array_Reverse_Oder {

	public static void main(String[] args) {
		int[] array=new int[]{1, 2, 3, 4, 5};
		System.out.println("original Array is "+Arrays.toString(array));
		System.out.println("Reverse Array :");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]);
		}

	}

}
