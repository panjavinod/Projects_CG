package com.demo;

import java.util.Arrays;

public class Index_Of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Write a Java program to find the index of an array element");
		int[] array=new int[] {2,6,4,8,9,1,7,5,9};
		int num=9;
		int index = -1;
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				index=i;	
			}
		}
		System.out.println("Index of array is "+index);
		
	
		System.out.println("Write a Java program to remove a specific element from an array.");
	    int a=4;
	    for(int i=0;i<array.length;i++) {
	    	if(array[i]==a) {
	    		array[i]=array[i+1];
	    	}
	    }
	    System.out.println(Arrays.toString(array));
	    
	    System.out.println("/Write a Java program to insert an element (specific position) into an array.");
	    int newvalue=4;
	    int position=3;
	    int[] newArray=new int[array.length+1];
	    for(int i=0;i<position;i++) {
	    	newArray[i]=array[i];
	    }
	    newArray[position]=newvalue;
	    for(int i=position;i<array.length;i++) {
	    	newArray[i+1]=array[i];
	    }
	    System.out.println(Arrays.toString(newArray));
	  //Write a Java program to test if an array contains a specific value.
	 //System.out.println("array contains a specific value "+test(array));
	}
	
//	public static boolean test(int[] array) {
//		boolean check=false;
//		int num=8;
//		for(int i=0;i<array.length;i++) {
//			if(array[i]==num) {
//				check=true;
//			}
//		}
//		return check;
//		
//	}

}
