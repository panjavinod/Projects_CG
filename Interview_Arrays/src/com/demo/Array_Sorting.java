package com.demo;

import java.util.Arrays;

public class Array_Sorting {

	public static void main(String[] args) {
		int[] array=new int[] {2,1,4,3,7,6,8};
		int temp;
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
//		for(int i=0;i<array.length-1;i++) {
//			if(array[i]>array[i+1]) {
//				temp=array[i];
//				array[i]=array[i+1];
//				array[i+1]=temp;
//			}
//		}
		System.out.println("Array Assending Order ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
//		Arrays.sort(array);
//		System.out.println("Using inbuilt Method "+Arrays.toString(array));
		
		System.out.println("--------------------------------------");
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp=array[j];
					array[j]=array[i];
					array[i]=temp;
				}
			}
		}
		System.out.println("Array Dsending Order ");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]);
		}
	}

}
