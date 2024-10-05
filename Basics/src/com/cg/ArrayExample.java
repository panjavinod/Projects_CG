package com.cg;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the array size");
//		int a=sc.nextInt();
//		int array[]=new int[a];
//		System.out.println("Enter the array elements ");
//		for(int i=0;i<a;i++) {
//			array[i]=sc.nextInt();
//		}
//System.out.println(Arrays.toString(array));
		
		//------------------------------------------------------------------------
		
//		int array[]= {7,2,3,4,5,6,1,1,2,1,3};
//		int array2[]=new int[array.length];
//		for(int i=0;i<array.length;i++) {
//			array2[i]=array[i];
//		}
//		System.out.println(Arrays.toString(array2));
		
		//------------------------------------------------------------------------
		
//		int array[]= {7,2,3,4,5,6,1,1,2,1,3};
//		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
//		int count=0;
//		for(int i=0;i<array.length;i++) {
//			for(int j=0;j<array.length;j++) {
//				if(array[i]==array[j]) {
//					count++;
//				}
//			}
//		
//			map1.put(array[i], count);
//			
//			count=0;
//		}
//		System.out.println(map1);
		
	   //------------------------------------------------------------------------
		
//		 int [] arr = new int [] {1, 2, 3, 4, 5};  
//		 int n = 3;  
//		 for(int i = 0; i < n; i++){  
//	            int j, first; 
//	            first = arr[0];  
//	            for(j = 0; j < arr.length-1; j++){  
//	            	 arr[j] = arr[j+1];  
//	            }  
//	            arr[j] = first;  
//	            }
//		 System.out.println();  
//		 System.out.println("Array after left rotation: ");  
//	        for(int i = 0; i< arr.length; i++){  
//	            System.out.print(arr[i] + " ");  
//	        }
//	        
//		//------------------------------------------------------------------------
	        
//		 int a[]= {1,2,3,4};
//		 for(int i=a.length-1;i>=0;i--) {
//			 System.out.println(a[i]+" ");
//		 }
//		 int max=a[0];
//		 for(int i=0;i<a.length;i++) {
//			 if(a[i]>max) {
//				 max=a[i];
//			 }
//		 }
//		 System.out.println(max);
		//------------------------------------------------------------------------
		
		
		
		
		int a[]= {4,5,1,5,6};
		Arrays.sort(a);
		System.out.println(a[1]);
}
}
