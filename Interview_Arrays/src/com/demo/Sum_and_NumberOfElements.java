package com.demo;

public class Sum_and_NumberOfElements {

	public static void main(String[] args) {
		int[] array= {40,30,67,84,285,91,23,5};
		int sum=0,numberOfElements=0;
		for(int i=0;i<array.length;i++) {
			numberOfElements++;
			sum+=array[i];
		}
		System.out.println("NumberOfElements in ARRAY IS "+numberOfElements);
		System.out.println("----------------------------");
		System.out.println("SUM of Elements in Array IS "+sum);
		
		
	}

}
