package com.demo;

import java.util.Arrays;

public class SortArrayOf_Strings {

	public static void main(String[] args) {
		String[] array= {"Java","Python","PHP","C#","C Programming","C++"};
		System.out.println("Before Sorting "+Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("After sorting "+Arrays.toString(array));
		
		for(int i=0;i<array.length-1;i++) {
			 if (array[i].compareTo(array[i+1]) > 0) {
					String temp=array[i];
					array[i]=array[i+1];
					array[i+1]=temp;
				}
				
		}
//		for(int i=0;i<array.length;i++) {
//			for(int j=i+1;j<array.length;j++) {
//				 if (array[i].compareTo(array[j]) > 0) {
//					String temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//				}
//				
//			}
//		}
		System.out.println(Arrays.toString(array));
		
		
	            

	}

}
