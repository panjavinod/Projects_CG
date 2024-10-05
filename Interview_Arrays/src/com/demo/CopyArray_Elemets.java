package com.demo;

public class CopyArray_Elemets {

	public static void main(String[] args) {
		int array[]=new int[] {1,2,3,4};
        int array2[] = new int[array.length];
        for(int i=0;i<array.length;i++) {
        	array2[i]=array[i];
        }
        System.out.println("Elemets of array2 is");
        for(int i=0;i<array2.length;i++) {
        	System.out.print(array2[i]);
        }
	}

}
