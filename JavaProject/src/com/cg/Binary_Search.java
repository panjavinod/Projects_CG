package com.cg;

import java.util.Scanner;

public class Binary_Search {

//	public static void main(String[] args) {
//		int array[]= {1,2,3,4,5,6,7,8,9,10};
//		boolean flag=false;
//		
//		System.out.println("Enter the key to check the binary search");
//		Scanner sc=new Scanner(System.in);
//		int key =sc.nextInt();
//		
//		int low=0;
//		int high=array.length-1;
//		
//		while(low<=high) {
//			int mid=(low+high)/2;
//			if(array[mid]==key) {
//				System.out.println("Element Found "+ key);
//				flag=true;
//				break;
//			}
//			if(array[mid]<key) {
//				low=mid+1;
//			}
//			if(array[mid]>key) {
//				high=mid-1;
//			}
//		}
//		if(flag==false) {
//			System.out.println("Element Not Found");
//		}
//
//	}
	

	
	    public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int mid = (left+right) / 2;

	            if (arr[mid] == target) {
	                return mid; // Element found, return its index
	            } else if (arr[mid] < target) {
	                left = mid + 1; // Search in the right half
	            } else {
	                right = mid - 1; // Search in the left half
	            }
	        }

	        return -1; // Element not found
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	        int targetElement = 12;

	        int resultIndex = binarySearch(sortedArray, targetElement);

	        if (resultIndex != -1) {
	            System.out.println("Element found at index: " + resultIndex);
	        } else {
	            System.out.println("Element not found in the array.");
	        }
	    
	}

	

}
