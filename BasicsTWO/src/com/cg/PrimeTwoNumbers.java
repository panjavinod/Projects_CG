package com.cg;

import java.util.Scanner;

public class PrimeTwoNumbers {
	
	public static int isprime(int n)
	   {
	     
	      for (int i = 2; i < n; i++){
	         
	         if(n%i == 0){
	            return -1;
	         }
	      }
	      return 1;
	   }
	 public static void main(String args[])
	   {
	      int lower_bound = 2, upper_bound = 50;
	      for (int i = lower_bound; i <= upper_bound; i++)
	      {
	         if(isprime(i) == 1)
	         {
	            System.out.print(i+" ");
	         }
	      }
	   }
	
	

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        int a, b, i, j, flag;
//        System.out.println("Enter lower bound of the interval: ");
//        a = sc.nextInt(); 
//        System.out.println("Enter upper bound of the interval: ");
//        b = sc.nextInt(); 
//        for (i = a; i <= b; i++) {
// 
////            if (i == 1 || i == 0)
////                continue;
//            flag = 1;
// 
//            for (j = 2; j <= i/2; ++j) {
//                if (i % j == 0) {
//                    flag = 0;
//                    break;
//                }
//            }
//            if (flag == 1)
//                System.out.print(i+" ");
//        }
//    }
	 
//	 public static void main(String[] args) {
//
//	        int low = 1, high = 10;
//	        
//
//	        while (low <= high) {
//	            
//	        	boolean flag = true;
//	            for(int i = 2; i <= low/2; ++i) {
//	                // condition for nonprime number
//	                if(low % i == 0) {
//	                    flag = false;
//	                    break;
//	                }
//	            }
//                 if(flag) {
//                	 System.out.print(low+" ");
//                 }
//	     
//	            ++low;
//	        }
//	    }

}
