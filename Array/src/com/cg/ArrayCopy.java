package com.cg;

public class ArrayCopy {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("original Array");
		int array[]= {1,2,3,4,5};
		int count=0,d=0;
		for(int i=0;i<array.length;i++) {
			count+=array[i];// sum of array elements
			d++; // present array elements
			System.out.println(array[i]+ " ");
		}
		System.out.println("sum of array");
		System.out.println(count);
		System.out.println("sum of present array");
		System.out.println(d);
		int array2[] = new int[array.length];
		
		for(int i=0;i<array.length;i++) {	
			array2[i]=array[i];	
		}
		System.out.println("copy Array");
		for(int i=0;i<array2.length;i++) {
			System.out.println(array2[i]);
		}
		System.out.println("----------");
		int arr[]=array2.clone(); //clone the array
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
					
		}
		int min=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) {
				min=array[i];
			}
		}
		System.out.println("minimum number");
		System.out.println(min);
		
	}
}
