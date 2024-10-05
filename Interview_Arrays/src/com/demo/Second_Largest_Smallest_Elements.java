package com.demo;

public class Second_Largest_Smallest_Elements {

	public static void main(String[] args) {
		int array[]={44,66,99,77,33,22,55}; 
		int max=array[0];
		int secondMax=0,thirdMax=0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				secondMax=max;
				max=array[i];
			}
			else if(array[i]>secondMax) {
				thirdMax=secondMax;
				secondMax=array[i];
			}
		}
		System.out.println("Laegest Element is "+max);
		System.out.println("Second largest Element is "+secondMax);
		System.out.println("--------------------------------------------");
		int min=array[0];
		int secondMin=0,thirdMin=0;
		for(int i=0;i<array.length;i++) {
			
			if(array[i]<min) {
				secondMin=min;
				min=array[i];
			}
			else if(array[i]<secondMin) {
				thirdMax=secondMin;
				secondMin=array[i];
			}
		}
		System.out.println("Laegest Element is "+min);
		System.out.println("Second largest Element is "+secondMin);

	}

}
