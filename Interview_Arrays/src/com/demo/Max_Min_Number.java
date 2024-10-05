package com.demo;

import java.util.Arrays;

public class Max_Min_Number {

	public static void main(String[] args) {
		int[] array= {40,30,67,84,285,91,23,5};
		int max,min;
		max=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.println("Max NUMBER Is "+max);
		System.out.println("-----------------------------------");
		min=array[0];
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min=array[i];
			}
		}
		System.out.println("Min  NUMBER Is "+min);
		int maxValue = Arrays.stream(array).max().getAsInt();
		System.out.println(maxValue);  
	}

}
