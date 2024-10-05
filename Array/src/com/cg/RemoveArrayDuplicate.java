package com.cg;

import java.util.Scanner;

public class RemoveArrayDuplicate {

//	public static int removeduplicates(int a[], int n)
//    {
//        if (n == 0 || n == 1) {
//            return n;
//        }
// 
//        // creating another array for only storing
//        // the unique elements
//        int[] temp = new int[n];
//        int j = 0;
// 
//        for (int i = 0; i < n-1; i++) {
//            if (a[i] != a[i + 1]) {
//                temp[j++] = a[i];
//           }
//        }
// 
//        temp[j++] = a[n - 1];
// 
//        // Changing the original array
//        for (int i = 0; i < j; i++) {
//            a[i] = temp[i];
//        }
// 
//        return j;
//    }
//    public static void main(String[] args)
//    {
//        int a[] = { 1, 10, 20, 20, 30,40,40 };
//        int n = a.length;
// 
//        n = removeduplicates(a, n);
// 
//        // Printing The array elements
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//    }
	public static void main(String[]args) {
		int a[] = { 1, 10, 20, 20, 30,40,40 };
		int temp[]=new int[a.length];
		int j=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]!=a[i+1]) {
				temp[j++]=a[i];
			}
		}
		
//		for(int i=0;i<j;i++) {
//			System.out.println(temp[i]);
//		}          // 1,10,20,30
		
	temp[j++] = a[a.length-1];

		 // Changing the original array
      for (int i = 0; i < j; i++) {
        a[i] = temp[i];
//    	  System.out.println(temp[i]);
		}
      for(int i=0;i<j;i++) {
    	  System.out.println(a[i]);
      }
	}
    
}
