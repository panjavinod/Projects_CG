package com.demo;

import java.util.Scanner;

public class RightRotate_Of_Array {

	public static void main(String[] args) {
		int array[]=new int[] {1,2,3,4};
	      System.out.println("Enter the how many left roatation do you want");
	      Scanner sc=new Scanner(System.in);
	      int leftRotate=sc.nextInt();
	      for(int i=0;i<leftRotate;i++) {
	    	  int last=array[array.length-1];
	    	  int j;
	    	  for(j=array.length-1;j>0;j--) {
	    		  array[j]=array[j-1];
	    	  }
	    	  array[0]=last;
	    	  
	      }
	      System.out.println();  
			 System.out.println("Array after left rotation: ");  
		        for(int i = 0; i< array.length; i++){  
		            System.out.print(array[i] + " ");  
		        }
	}

}
